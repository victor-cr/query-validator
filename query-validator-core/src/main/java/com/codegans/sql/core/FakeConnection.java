package com.codegans.sql.core;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

public class FakeConnection extends StatementValidatorWrapper implements Connection {
    private final AtomicBoolean autoCommit;
    private final AtomicBoolean readOnly;
    private final DatabaseMetaData databaseMetaData;

    public FakeConnection(StatementValidator validator, DatabaseMetaData databaseMetaData) {
        super(validator);
        this.autoCommit = new AtomicBoolean(true);
        this.readOnly = new AtomicBoolean(false);
        this.databaseMetaData = databaseMetaData;
    }

    @Override
    public Statement createStatement() throws SQLException {
        log.debug("Invoked: Connection.createStatement()");
        return new FakeStatement(validator, this);
    }

    @Override
    public PreparedStatement prepareStatement(String sql) throws SQLException {
        log.debug("Invoked: Connection.prepareStatement(String)");
        return new FakePreparedStatement(validator, this, sql);
    }

    @Override
    public CallableStatement prepareCall(String sql) throws SQLException {
        log.debug("Invoked: Connection.prepareCall(String)");
        return new FakeCallableStatement(validator, this, sql);
    }

    @Override
    public String nativeSQL(String sql) throws SQLException {
        log.debug("Invoked: Connection.nativeSQL(String)");
        return sql;
    }

    @Override
    public void setAutoCommit(boolean autoCommit) throws SQLException {
        log.debug("Invoked: Connection.setAutoCommit(boolean)");
        this.autoCommit.set(autoCommit);
    }

    @Override
    public boolean getAutoCommit() throws SQLException {
        log.debug("Invoked: Connection.getAutoCommit()");
        return this.autoCommit.get();
    }

    @Override
    public void commit() throws SQLException {
        log.debug("Invoked: Connection.commit()");
    }

    @Override
    public void rollback() throws SQLException {
        log.debug("Invoked: Connection.rollback()");
    }

    @Override
    public DatabaseMetaData getMetaData() throws SQLException {
        assertOpen();
        log.debug("Invoked: Connection.getMetaData()");
        return databaseMetaData;
    }

    @Override
    public void setReadOnly(boolean readOnly) throws SQLException {
        assertOpen();
        log.debug("Invoked: Connection.setReadOnly(boolean)");
        this.readOnly.set(readOnly);
    }

    @Override
    public boolean isReadOnly() throws SQLException {
        assertOpen();
        log.debug("Invoked: Connection.isReadOnly()");
        return this.readOnly.get();
    }

    @Override
    public void setCatalog(String catalog) throws SQLException {

    }

    @Override
    public String getCatalog() throws SQLException {
        return null;
    }

    @Override
    public void setTransactionIsolation(int level) throws SQLException {

    }

    @Override
    public int getTransactionIsolation() throws SQLException {
        return 0;
    }

    @Override
    public SQLWarning getWarnings() throws SQLException {
        return null;
    }

    @Override
    public void clearWarnings() throws SQLException {

    }

    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return null;
    }

    @Override
    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
        return null;
    }

    @Override
    public Map<String, Class<?>> getTypeMap() throws SQLException {
        return null;
    }

    @Override
    public void setTypeMap(Map<String, Class<?>> map) throws SQLException {

    }

    @Override
    public void setHoldability(int holdability) throws SQLException {

    }

    @Override
    public int getHoldability() throws SQLException {
        return 0;
    }

    @Override
    public Savepoint setSavepoint() throws SQLException {
        return null;
    }

    @Override
    public Savepoint setSavepoint(String name) throws SQLException {
        return null;
    }

    @Override
    public void rollback(Savepoint savepoint) throws SQLException {

    }

    @Override
    public void releaseSavepoint(Savepoint savepoint) throws SQLException {

    }

    @Override
    public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return null;
    }

    @Override
    public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
        return null;
    }

    @Override
    public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
        return null;
    }

    @Override
    public Clob createClob() throws SQLException {
        return null;
    }

    @Override
    public Blob createBlob() throws SQLException {
        return null;
    }

    @Override
    public NClob createNClob() throws SQLException {
        return null;
    }

    @Override
    public SQLXML createSQLXML() throws SQLException {
        return null;
    }

    @Override
    public boolean isValid(int timeout) throws SQLException {
        return false;
    }

    @Override
    public void setClientInfo(String name, String value) throws SQLClientInfoException {

    }

    @Override
    public void setClientInfo(Properties properties) throws SQLClientInfoException {

    }

    @Override
    public String getClientInfo(String name) throws SQLException {
        return null;
    }

    @Override
    public Properties getClientInfo() throws SQLException {
        return null;
    }

    @Override
    public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
        return null;
    }

    @Override
    public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
        return null;
    }

    @Override
    public void setSchema(String schema) throws SQLException {

    }

    @Override
    public String getSchema() throws SQLException {
        return null;
    }

    @Override
    public void abort(Executor executor) throws SQLException {

    }

    @Override
    public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {

    }

    @Override
    public int getNetworkTimeout() throws SQLException {
        return 0;
    }

    @Override
    public <T> T unwrap(Class<T> iface) throws SQLException {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) throws SQLException {
        return false;
    }
}
