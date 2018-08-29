package com.codegans.sql.core;

import java.sql.JDBCType;

public class NamedParameter implements Parameter {
    private final String parameterName;
    private final JDBCType parameterType;

    public NamedParameter(String parameterName, JDBCType parameterType) {
        this.parameterName = parameterName;
        this.parameterType = parameterType == null ? JDBCType.NULL : parameterType;
    }

    public String name() {
        return parameterName;
    }

    @Override
    public boolean isNull() {
        return parameterType == JDBCType.NULL;
    }

    @Override
    public JDBCType parameterType() {
        return parameterType;
    }
}
