package com.codegans.sql.core;

import java.sql.JDBCType;

public interface Parameter {
    boolean isNull();

    JDBCType parameterType();
}
