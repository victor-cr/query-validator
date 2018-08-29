package com.codegans.sql.core;

import java.sql.JDBCType;

public class PositionalParameter implements Parameter {
    private final int position;
    private final JDBCType parameterType;

    public PositionalParameter(int position, JDBCType parameterType) {
        this.position = position;
        this.parameterType = parameterType == null ? JDBCType.NULL : parameterType;
    }

    public int position() {
        return position;
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
