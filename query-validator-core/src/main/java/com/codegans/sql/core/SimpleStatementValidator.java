package com.codegans.sql.core;

import java.sql.SQLException;
import java.util.Collection;
import java.util.function.Consumer;

public class SimpleStatementValidator implements StatementValidator {
    private final Consumer<String> parser;

    public SimpleStatementValidator(Consumer<String> parser) {
        this.parser = parser;
    }

    @Override
    public QueryType validate(String query, Collection<? extends Parameter> parameters) throws SQLException {
        try {
            parser.accept(query);
        } catch (RuntimeException e) {
            throw new SQLException("Invalid SQL statement: " + e.getMessage(), e);
        }

        return QueryType.DML_READ;
    }
}
