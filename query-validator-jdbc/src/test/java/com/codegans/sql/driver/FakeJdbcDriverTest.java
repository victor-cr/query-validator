package com.codegans.sql.driver;

import com.codegans.sql.core.SimpleStatementValidator;
import com.codegans.sql.grammar.MySqlLexer;
import com.codegans.sql.grammar.MySqlParser;
import com.codegans.sql.grammar.utils.UpperCaseCharStream;
import org.antlr.v4.runtime.*;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.DriverManager;
import java.sql.SQLException;

public class FakeJdbcDriverTest {
    private static final FakeJdbcDriver TARGET = new FakeJdbcDriver(new SimpleStatementValidator(Assert::assertNotNull));

    @BeforeClass
    public static void beforeAll() throws SQLException {
        DriverManager.registerDriver(TARGET);
    }

    @AfterClass
    public static void afterAll() throws SQLException {
        DriverManager.deregisterDriver(TARGET);
    }

    @Test
    public void testGetConnection() throws SQLException {
        try (var connection = DriverManager.getConnection("any://url")) {
            Assert.assertNotNull(connection);
        }
    }

    @Test
    public void testGetPreparedStatement() throws SQLException {
        try (var connection = DriverManager.getConnection("any://url")) {
            try (var ps = connection.prepareCall("select aField from aTable")) {
                Assert.assertNotNull(ps);
            }
        }
    }

    @Test
    public void testGetResultSet() throws SQLException {
        try (var connection = DriverManager.getConnection("any://url")) {
            try (var ps = connection.prepareStatement("select aField from aTable")) {
                try (var rs = ps.executeQuery()) {
                    Assert.assertNotNull(rs);
                }
            }
        }
    }

    @Test
    public void testResultSetNext() throws SQLException {
        try (var connection = DriverManager.getConnection("any://url")) {
            try (var ps = connection.prepareStatement("select aField from aTable where ? = :named")) {
                try (var rs = ps.executeQuery()) {
                    Assert.assertFalse(rs.next());
                }
            }
        }
    }
}
