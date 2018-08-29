package com.codegans.sql.core;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.*;
import java.util.Calendar;
import java.util.concurrent.ConcurrentHashMap;

public class FakePreparedStatement extends FakeStatement implements PreparedStatement {
    private final String sql;
    private final ConcurrentHashMap<Integer, PositionalParameter> parameters;

    public FakePreparedStatement(StatementValidator validator, FakeConnection parent, String sql) {
        super(validator, parent);

        this.sql = sql;
        this.parameters = new ConcurrentHashMap<>();
    }

    @Override
    public ResultSet executeQuery() throws SQLException {
        invokeOpened();

        if (validator.validate(sql, parameters.values()) != QueryType.DML_READ) {
            throw new SQLException("Incorrect query type (expected SELECT query)");
        }

        return resultSet.updateAndGet(e -> new EmptyResultSet(this));
    }

    @Override
    public int executeUpdate() throws SQLException {
        invokeOpened();

        if (validator.validate(sql, parameters.values()) == QueryType.DML_READ) {
            throw new SQLException("expected DML update/insert/delete or DDL statement");
        }

        resultSet.set(null);

        return 0;
    }

    @Override
    public boolean execute() throws SQLException {
        invokeOpened();

        QueryType type = validator.validate(sql, parameters.values());

        if (type == QueryType.DML_READ) {
            resultSet.updateAndGet(e -> new EmptyResultSet(this));
            return true;
        } else {
            resultSet.set(null);
            return false;
        }
    }

    @Override
    public void setNull(int parameterIndex, int sqlType) throws SQLException {
        invokeOpened(parameterIndex, sqlType);

        if (parameters.putIfAbsent(parameterIndex, new PositionalParameter(parameterIndex, JDBCType.NULL)) != null) {
            throw new SQLException("Parameter with position " + parameterIndex + " has been already bound to the statement");
        }
    }

    @Override
    public void setBoolean(int parameterIndex, boolean x) throws SQLException {
        addParam(parameterIndex, JDBCType.BOOLEAN, x);
    }

    @Override
    public void setByte(int parameterIndex, byte x) throws SQLException {
        addParam(parameterIndex, JDBCType.SMALLINT, x);
    }

    @Override
    public void setShort(int parameterIndex, short x) throws SQLException {
        addParam(parameterIndex, JDBCType.SMALLINT, x);
    }

    @Override
    public void setInt(int parameterIndex, int x) throws SQLException {
        addParam(parameterIndex, JDBCType.INTEGER, x);
    }

    @Override
    public void setLong(int parameterIndex, long x) throws SQLException {
        addParam(parameterIndex, JDBCType.NUMERIC, x);
    }

    @Override
    public void setFloat(int parameterIndex, float x) throws SQLException {
        addParam(parameterIndex, JDBCType.FLOAT, x);
    }

    @Override
    public void setDouble(int parameterIndex, double x) throws SQLException {
        addParam(parameterIndex, JDBCType.DOUBLE, x);
    }

    @Override
    public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {
        addParam(parameterIndex, JDBCType.NUMERIC, x);
    }

    @Override
    public void setString(int parameterIndex, String x) throws SQLException {
        addParam(parameterIndex, JDBCType.VARCHAR, x);
    }

    @Override
    public void setBytes(int parameterIndex, byte[] x) throws SQLException {
        addParam(parameterIndex, JDBCType.BINARY, x);
    }

    @Override
    public void setDate(int parameterIndex, Date x) throws SQLException {
        addParam(parameterIndex, JDBCType.DATE, x);
    }

    @Override
    public void setTime(int parameterIndex, Time x) throws SQLException {
        addParam(parameterIndex, JDBCType.TIME, x);
    }

    @Override
    public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {
        addParam(parameterIndex, JDBCType.TIMESTAMP, x);
    }

    @Override
    public void setAsciiStream(int parameterIndex, InputStream x, int length) throws SQLException {
        addParam(parameterIndex, JDBCType.CLOB, x, length);
    }

    @Override
    public void setUnicodeStream(int parameterIndex, InputStream x, int length) throws SQLException {
        addParam(parameterIndex, JDBCType.NCLOB, x, length);
    }

    @Override
    public void setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException {
        addParam(parameterIndex, JDBCType.BINARY, x, length);
    }

    @Override
    public void clearParameters() throws SQLException {
        invokeOpened();
        parameters.clear();
    }

    @Override
    public void setObject(int parameterIndex, Object x, int targetSqlType) throws SQLException {
        addParam(parameterIndex, JDBCType.valueOf(targetSqlType), x, targetSqlType);
    }

    @Override
    public void setObject(int parameterIndex, Object x) throws SQLException {
        addParam(parameterIndex, JDBCType.JAVA_OBJECT, x);
    }

    @Override
    public void addBatch() throws SQLException {
        clearParameters();
        //TODO implement batches
    }

    @Override
    public void setCharacterStream(int parameterIndex, Reader reader, int length) throws SQLException {
        addParam(parameterIndex, JDBCType.CLOB, reader, length);
    }

    @Override
    public void setRef(int parameterIndex, Ref x) throws SQLException {
        addParam(parameterIndex, JDBCType.REF, x);
    }

    @Override
    public void setBlob(int parameterIndex, Blob x) throws SQLException {
        addParam(parameterIndex, JDBCType.BLOB, x);
    }

    @Override
    public void setClob(int parameterIndex, Clob x) throws SQLException {
        addParam(parameterIndex, JDBCType.CLOB, x);
    }

    @Override
    public void setArray(int parameterIndex, Array x) throws SQLException {
        addParam(parameterIndex, JDBCType.ARRAY, x);
    }

    @Override
    public ResultSetMetaData getMetaData() throws SQLException {
        invokeOpened();
        return null; //TODO Implement it
    }

    @Override
    public void setDate(int parameterIndex, Date x, Calendar cal) throws SQLException {
        addParam(parameterIndex, JDBCType.DATE, x, cal);
    }

    @Override
    public void setTime(int parameterIndex, Time x, Calendar cal) throws SQLException {
        addParam(parameterIndex, JDBCType.TIME_WITH_TIMEZONE, x, cal);
    }

    @Override
    public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) throws SQLException {
        addParam(parameterIndex, JDBCType.TIMESTAMP_WITH_TIMEZONE, x, cal);
    }

    @Override
    public void setNull(int parameterIndex, int sqlType, String typeName) throws SQLException {
        invokeOpened(parameterIndex, sqlType, typeName);

        if (parameters.putIfAbsent(parameterIndex, new PositionalParameter(parameterIndex, JDBCType.NULL)) != null) {
            throw new SQLException("Parameter with position " + parameterIndex + " has been already bound to the statement");
        }
    }

    @Override
    public void setURL(int parameterIndex, URL x) throws SQLException {
        addParam(parameterIndex, JDBCType.DATALINK, x);
    }

    @Override
    public ParameterMetaData getParameterMetaData() throws SQLException {
        return null; //TODO implement it
    }

    @Override
    public void setRowId(int parameterIndex, RowId x) throws SQLException {
        addParam(parameterIndex, JDBCType.ROWID, x);
    }

    @Override
    public void setNString(int parameterIndex, String value) throws SQLException {
        addParam(parameterIndex, JDBCType.NVARCHAR, value);
    }

    @Override
    public void setNCharacterStream(int parameterIndex, Reader value, long length) throws SQLException {
        addParam(parameterIndex, JDBCType.NCLOB, value, length);
    }

    @Override
    public void setNClob(int parameterIndex, NClob value) throws SQLException {
        addParam(parameterIndex, JDBCType.NCLOB, value);
    }

    @Override
    public void setClob(int parameterIndex, Reader reader, long length) throws SQLException {
        addParam(parameterIndex, JDBCType.CLOB, reader, length);
    }

    @Override
    public void setBlob(int parameterIndex, InputStream inputStream, long length) throws SQLException {
        addParam(parameterIndex, JDBCType.BLOB, inputStream, length);
    }

    @Override
    public void setNClob(int parameterIndex, Reader reader, long length) throws SQLException {
        addParam(parameterIndex, JDBCType.NCLOB, reader, length);
    }

    @Override
    public void setSQLXML(int parameterIndex, SQLXML xmlObject) throws SQLException {
        addParam(parameterIndex, JDBCType.SQLXML, xmlObject);
    }

    @Override
    public void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength) throws SQLException {
        addParam(parameterIndex, JDBCType.valueOf(targetSqlType), x, targetSqlType, scaleOrLength);
    }

    @Override
    public void setAsciiStream(int parameterIndex, InputStream x, long length) throws SQLException {
        addParam(parameterIndex, JDBCType.LONGVARCHAR, x, length);
    }

    @Override
    public void setBinaryStream(int parameterIndex, InputStream x, long length) throws SQLException {
        addParam(parameterIndex, JDBCType.BINARY, x, length);
    }

    @Override
    public void setCharacterStream(int parameterIndex, Reader reader, long length) throws SQLException {
        addParam(parameterIndex, JDBCType.LONGVARCHAR, reader, length);
    }

    @Override
    public void setAsciiStream(int parameterIndex, InputStream x) throws SQLException {
        addParam(parameterIndex, JDBCType.LONGVARCHAR, x);
    }

    @Override
    public void setBinaryStream(int parameterIndex, InputStream x) throws SQLException {
        addParam(parameterIndex, JDBCType.BINARY, x);
    }

    @Override
    public void setCharacterStream(int parameterIndex, Reader reader) throws SQLException {
        addParam(parameterIndex, JDBCType.LONGVARCHAR, reader);
    }

    @Override
    public void setNCharacterStream(int parameterIndex, Reader value) throws SQLException {
        addParam(parameterIndex, JDBCType.LONGNVARCHAR, value);
    }

    @Override
    public void setClob(int parameterIndex, Reader reader) throws SQLException {
        addParam(parameterIndex, JDBCType.CLOB, reader);
    }

    @Override
    public void setBlob(int parameterIndex, InputStream inputStream) throws SQLException {
        addParam(parameterIndex, JDBCType.BLOB, inputStream);
    }

    @Override
    public void setNClob(int parameterIndex, Reader reader) throws SQLException {
        addParam(parameterIndex, JDBCType.NCLOB, reader);
    }

    protected void addParam(int position, JDBCType type, Object... values) throws SQLException {
        invokeOpened(position, values);

        if (parameters.putIfAbsent(position, new PositionalParameter(position, type)) != null) {
            throw new SQLException("Parameter with position " + position + " has been already bound to the statement");
        }
    }
}
