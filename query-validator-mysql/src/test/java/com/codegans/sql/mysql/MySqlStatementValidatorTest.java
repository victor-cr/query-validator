package com.codegans.sql.mysql;

import com.codegans.sql.core.NamedParameter;
import com.codegans.sql.core.PositionalParameter;
import com.codegans.sql.core.QueryType;
import org.junit.Assert;
import org.junit.Test;

import java.sql.JDBCType;
import java.sql.SQLException;
import java.util.Collections;

public class MySqlStatementValidatorTest {
    private MySqlStatementValidator target = new MySqlStatementValidator();

    @Test
    public void testSimpleQuery() throws SQLException {
        QueryType expected = QueryType.DML_READ;
        QueryType actual = target.validate("select * from A_TABLE", Collections.emptyList());

        Assert.assertSame(expected, actual);
    }

    @Test
    public void testJdbcParamQuery() throws SQLException {
        QueryType expected = QueryType.DML_READ;
        QueryType actual = target.validate("select * from A_TABLE where ID = ?", Collections.singletonList(new PositionalParameter(1, JDBCType.VARCHAR)));

        Assert.assertSame(expected, actual);
    }

    @Test
    public void testNamedParamQuery() throws SQLException {
        QueryType expected = QueryType.DML_READ;
        QueryType actual = target.validate("select * from A_TABLE where ID = :ID", Collections.singletonList(new NamedParameter("id", JDBCType.VARCHAR)));

        Assert.assertSame(expected, actual);
    }
}
