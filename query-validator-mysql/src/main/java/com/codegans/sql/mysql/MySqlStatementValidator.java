package com.codegans.sql.mysql;

import com.codegans.sql.core.*;
import com.codegans.sql.grammar.MySqlLexer;
import com.codegans.sql.grammar.MySqlParser;
import com.codegans.sql.grammar.MySqlParserBaseVisitor;
import com.codegans.sql.grammar.utils.UpperCaseCharStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MySqlStatementValidator implements StatementValidator {
    @Override
    public QueryType validate(String query, Collection<? extends Parameter> parameters) throws SQLException {
        MySqlParser parser = new MySqlParser(new CommonTokenStream(new MySqlLexer(new UpperCaseCharStream(CharStreams.fromString(query)))));

        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
                throw e;
            }
        });

        Visitor<?> visitor = new Visitor<>();

        parser.root().accept(visitor);

        List<String> actualParams = visitor.params;

        List<String> errors = new ArrayList<>();

        for (Parameter param : parameters) {
            if (param instanceof PositionalParameter) {
                int i = ((PositionalParameter) param).position();

                if (i <= 0 || actualParams.size() < i) {
                    errors.add("Expected parameter index out of bounds: " + i);
                } else {
                    String actualParam = actualParams.get(i - 1);

                    switch (actualParam) {
                        case "":
                            errors.add("Duplicated expected parameter index: " + i);
                            break;
                        case "?":
                            actualParams.set(i - 1, "");
                            break;
                        default:
                            errors.add("Expected indexed parameter at " + i + ", but found: " + actualParam);
                    }
                }
            } else if (param instanceof NamedParameter) {
                String expectedParam = ":" + ((NamedParameter) param).name();

                boolean found = false;

                for (int i = 0; i < actualParams.size(); i++) {
                    if (expectedParam.equalsIgnoreCase(actualParams.get(i))) {
                        actualParams.set(i, "");
                        found = true;
                    }
                }

                if (!found) {
                    errors.add("Expected named parameter " + expectedParam + " was not found");
                }
            } else {
                errors.add("Unknown type of a parameter: " + param.getClass());
            }
        }

        for (int i = 0; i < actualParams.size(); i++) {
            String actualParam = actualParams.get(i);

            if (actualParam.length() > 0) {
                errors.add("Found not bound parameter at position " + (i + 1) + ": " + actualParam);
            }
        }

        if (!errors.isEmpty()) {
            throw new IllegalArgumentException("Validation errors:\n" + String.join("\n", errors));
        }

        return visitor.type;
    }

    private static class Visitor<T> extends MySqlParserBaseVisitor<T> {
        private final List<String> params = new ArrayList<>();
        private QueryType type;
        private String rootStatement;

        @Override
        public T visitSqlStatements(MySqlParser.SqlStatementsContext ctx) {
            if (ctx.children.size() != 1) {
                throw new IllegalArgumentException("Expected only one statement: " + ctx.getText());
            }

            return super.visitSqlStatements(ctx);
        }

        @Override
        public T visitDmlStatement(MySqlParser.DmlStatementContext ctx) {
            if (rootStatement == null) {
                rootStatement = ctx.start.getText();
            }

            if (type == null) {
                type = rootStatement.equalsIgnoreCase("SELECT") ? QueryType.DML_READ : QueryType.DML_WRITE;
            }

            return super.visitDmlStatement(ctx);
        }

        @Override
        public T visitDdlStatement(MySqlParser.DdlStatementContext ctx) {
            if (rootStatement == null) {
                rootStatement = ctx.start.getText();
            }

            if (type == null) {
                type = QueryType.DDL;
            }

            return super.visitDdlStatement(ctx);
        }

        @Override
        public T visitParamExpressionAtom(MySqlParser.ParamExpressionAtomContext ctx) {
            TerminalNode param = ctx.JDBC_PARAM();

            if (param != null) {
                params.add("?");
            } else {
                params.add(ctx.NAMED_PARAM().getText());
            }

            return super.visitParamExpressionAtom(ctx);
        }
    }
}
