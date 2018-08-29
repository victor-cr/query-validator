package com.codegans.sql.core;

import java.sql.SQLException;
import java.util.Collection;

public interface StatementValidator {
    QueryType validate(String query, Collection<? extends Parameter> parameters) throws SQLException;
}
