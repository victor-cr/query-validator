package com.codegans.sql.driver;

import com.codegans.sql.core.Parameter;
import com.codegans.sql.core.PositionalParameter;
import com.codegans.sql.core.StatementValidator;
import org.jooq.tools.jdbc.MockConnection;
import org.jooq.tools.jdbc.MockResult;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverPropertyInfo;
import java.sql.JDBCType;
import java.util.*;
import java.util.logging.Logger;

public class FakeJdbcDriver implements Driver {
    private final Logger log = Logger.getLogger(getClass().getName());

    private final StatementValidator validator;

    public FakeJdbcDriver(StatementValidator validator) {
        this.validator = validator;
    }

    @Override
    public Connection connect(String url, Properties info) {
        return new MockConnection(ctx -> {
            Object[][] data = ctx.batchBindings();
            String[] queries = ctx.batchSQL();

            for (int i = 0; i < queries.length; i++) {
                List<Parameter> values = data == null ? Collections.emptyList() : toList(data[i]);

                validator.validate(queries[i], values);
            }

            return new MockResult[]{new MockResult(0, new EmptyResult())};
        });
    }

    @Override
    public boolean acceptsURL(String url) {
        return true;
    }

    @Override
    public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) {
        return new DriverPropertyInfo[0];
    }

    @Override
    public int getMajorVersion() {
        return 4;
    }

    @Override
    public int getMinorVersion() {
        return 0;
    }

    @Override
    public boolean jdbcCompliant() {
        return true;
    }

    @Override
    public Logger getParentLogger() {
        return log;
    }

    private List<Parameter> toList(Object... args) {
        var result = new ArrayList<Parameter>(args.length);

        for (int i = 0; i < args.length; i++) {
            result.add(toParameter(i, args[i]));
        }

        return result;
    }

    private PositionalParameter toParameter(int i, Object param) {
        if (param == null) {
            return new PositionalParameter(i, JDBCType.NULL);
        }

        if (param instanceof String) {
            return new PositionalParameter(i, JDBCType.VARCHAR);
        }

        if (param instanceof Date) {
            return new PositionalParameter(i, JDBCType.DATE);
        }

        if (param instanceof Number) {
            return new PositionalParameter(i, JDBCType.NUMERIC);
        }

        return new PositionalParameter(i, JDBCType.JAVA_OBJECT);
    }
}
