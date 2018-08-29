package com.codegans.sql.core;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.RowIdLifetime;

public class FakeDatabaseMetaData implements DatabaseMetaData {
    private final String url;
    private final String username;

    public FakeDatabaseMetaData(String url, String username) {
        this.url = url;
        this.username = username;
    }

    @Override
    public boolean allProceduresAreCallable() {
        return true;
    }

    @Override
    public boolean allTablesAreSelectable() {
        return true;
    }

    @Override
    public String getURL() {
        return url;
    }

    @Override
    public String getUserName() {
        return username;
    }

    @Override
    public boolean isReadOnly() {
        return false;
    }

    @Override
    public boolean nullsAreSortedHigh() {
        return false;
    }

    @Override
    public boolean nullsAreSortedLow() {
        return false;
    }

    @Override
    public boolean nullsAreSortedAtStart() {
        return false;
    }

    @Override
    public boolean nullsAreSortedAtEnd() {
        return false;
    }

    @Override
    public String getDatabaseProductName() {
        return Version.getDatabaseName();
    }

    @Override
    public String getDatabaseProductVersion() {
        return Version.getDatabaseVersion();
    }

    @Override
    public String getDriverName() {
        return Version.getDriverName();
    }

    @Override
    public String getDriverVersion() {
        return Version.getDriverVersion();
    }

    @Override
    public int getDriverMajorVersion() {
        return Version.getDriverMajorVersion();
    }

    @Override
    public int getDriverMinorVersion() {
        return Version.getDriverMinorVersion();
    }

    @Override
    public boolean usesLocalFiles() {
        return false;
    }

    @Override
    public boolean usesLocalFilePerTable() {
        return false;
    }

    @Override
    public boolean supportsMixedCaseIdentifiers() {
        return false;
    }

    @Override
    public boolean storesUpperCaseIdentifiers() {
        return false;
    }

    @Override
    public boolean storesLowerCaseIdentifiers() {
        return false;
    }

    @Override
    public boolean storesMixedCaseIdentifiers() {
        return false;
    }

    @Override
    public boolean supportsMixedCaseQuotedIdentifiers() {
        return false;
    }

    @Override
    public boolean storesUpperCaseQuotedIdentifiers() {
        return false;
    }

    @Override
    public boolean storesLowerCaseQuotedIdentifiers() {
        return false;
    }

    @Override
    public boolean storesMixedCaseQuotedIdentifiers() {
        return false;
    }

    @Override
    public String getIdentifierQuoteString() {
        return " ";
    }

    @Override
    public String getSQLKeywords() {
        return "";
    }

    @Override
    public String getNumericFunctions() {
        return "";
    }

    @Override
    public String getStringFunctions() {
        return "";
    }

    @Override
    public String getSystemFunctions() {
        return "";
    }

    @Override
    public String getTimeDateFunctions() {
        return "";
    }

    @Override
    public String getSearchStringEscape() {
        return "";
    }

    @Override
    public String getExtraNameCharacters() {
        return "";
    }

    @Override
    public boolean supportsAlterTableWithAddColumn() {
        return true;
    }

    @Override
    public boolean supportsAlterTableWithDropColumn() {
        return true;
    }

    @Override
    public boolean supportsColumnAliasing() {
        return true;
    }

    @Override
    public boolean nullPlusNonNullIsNull() {
        return true;
    }

    @Override
    public boolean supportsConvert() {
        return true;
    }

    @Override
    public boolean supportsConvert(int fromType, int toType) {
        return true;
    }

    @Override
    public boolean supportsTableCorrelationNames() {
        return true;
    }

    @Override
    public boolean supportsDifferentTableCorrelationNames() {
        return true;
    }

    @Override
    public boolean supportsExpressionsInOrderBy() {
        return true;
    }

    @Override
    public boolean supportsOrderByUnrelated() {
        return true;
    }

    @Override
    public boolean supportsGroupBy() {
        return true;
    }

    @Override
    public boolean supportsGroupByUnrelated() {
        return true;
    }

    @Override
    public boolean supportsGroupByBeyondSelect() {
        return true;
    }

    @Override
    public boolean supportsLikeEscapeClause() {
        return true;
    }

    @Override
    public boolean supportsMultipleResultSets() {
        return true;
    }

    @Override
    public boolean supportsMultipleTransactions() {
        return true;
    }

    @Override
    public boolean supportsNonNullableColumns() {
        return true;
    }

    @Override
    public boolean supportsMinimumSQLGrammar() {
        return true;
    }

    @Override
    public boolean supportsCoreSQLGrammar() {
        return true;
    }

    @Override
    public boolean supportsExtendedSQLGrammar() {
        return true;
    }

    @Override
    public boolean supportsANSI92EntryLevelSQL() {
        return true;
    }

    @Override
    public boolean supportsANSI92IntermediateSQL() {
        return true;
    }

    @Override
    public boolean supportsANSI92FullSQL() {
        return true;
    }

    @Override
    public boolean supportsIntegrityEnhancementFacility() {
        return true;
    }

    @Override
    public boolean supportsOuterJoins() {
        return true;
    }

    @Override
    public boolean supportsFullOuterJoins() {
        return true;
    }

    @Override
    public boolean supportsLimitedOuterJoins() {
        return true;
    }

    @Override
    public String getSchemaTerm() {
        return "schema";
    }

    @Override
    public String getProcedureTerm() {
        return "procedure";
    }

    @Override
    public String getCatalogTerm() {
        return "catalog";
    }

    @Override
    public boolean isCatalogAtStart() {
        return true;
    }

    @Override
    public String getCatalogSeparator() {
        return ".";
    }

    @Override
    public boolean supportsSchemasInDataManipulation() {
        return true;
    }

    @Override
    public boolean supportsSchemasInProcedureCalls() {
        return true;
    }

    @Override
    public boolean supportsSchemasInTableDefinitions() {
        return true;
    }

    @Override
    public boolean supportsSchemasInIndexDefinitions() {
        return true;
    }

    @Override
    public boolean supportsSchemasInPrivilegeDefinitions() {
        return true;
    }

    @Override
    public boolean supportsCatalogsInDataManipulation() {
        return true;
    }

    @Override
    public boolean supportsCatalogsInProcedureCalls() {
        return true;
    }

    @Override
    public boolean supportsCatalogsInTableDefinitions() {
        return true;
    }

    @Override
    public boolean supportsCatalogsInIndexDefinitions() {
        return true;
    }

    @Override
    public boolean supportsCatalogsInPrivilegeDefinitions() {
        return true;
    }

    @Override
    public boolean supportsPositionedDelete() {
        return true;
    }

    @Override
    public boolean supportsPositionedUpdate() {
        return true;
    }

    @Override
    public boolean supportsSelectForUpdate() {
        return true;
    }

    @Override
    public boolean supportsStoredProcedures() {
        return true;
    }

    @Override
    public boolean supportsSubqueriesInComparisons() {
        return true;
    }

    @Override
    public boolean supportsSubqueriesInExists() {
        return true;
    }

    @Override
    public boolean supportsSubqueriesInIns() {
        return true;
    }

    @Override
    public boolean supportsSubqueriesInQuantifieds() {
        return true;
    }

    @Override
    public boolean supportsCorrelatedSubqueries() {
        return true;
    }

    @Override
    public boolean supportsUnion() {
        return true;
    }

    @Override
    public boolean supportsUnionAll() {
        return true;
    }

    @Override
    public boolean supportsOpenCursorsAcrossCommit() {
        return true;
    }

    @Override
    public boolean supportsOpenCursorsAcrossRollback() {
        return true;
    }

    @Override
    public boolean supportsOpenStatementsAcrossCommit() {
        return true;
    }

    @Override
    public boolean supportsOpenStatementsAcrossRollback() {
        return true;
    }

    @Override
    public int getMaxBinaryLiteralLength() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMaxCharLiteralLength() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMaxColumnNameLength() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMaxColumnsInGroupBy() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMaxColumnsInIndex() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMaxColumnsInOrderBy() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMaxColumnsInSelect() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMaxColumnsInTable() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMaxConnections() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMaxCursorNameLength() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMaxIndexLength() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMaxSchemaNameLength() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMaxProcedureNameLength() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMaxCatalogNameLength() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMaxRowSize() {
        return Integer.MAX_VALUE;
    }

    @Override
    public boolean doesMaxRowSizeIncludeBlobs() {
        return false;
    }

    @Override
    public int getMaxStatementLength() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMaxStatements() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMaxTableNameLength() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMaxTablesInSelect() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getMaxUserNameLength() {
        return Integer.MAX_VALUE;
    }

    @Override
    public int getDefaultTransactionIsolation() {
        return 1;
    }

    @Override
    public boolean supportsTransactions() {
        return true;
    }

    @Override
    public boolean supportsTransactionIsolationLevel(int level) {
        return true;
    }

    @Override
    public boolean supportsDataDefinitionAndDataManipulationTransactions() {
        return true;
    }

    @Override
    public boolean supportsDataManipulationTransactionsOnly() {
        return true;
    }

    @Override
    public boolean dataDefinitionCausesTransactionCommit() {
        return true;
    }

    @Override
    public boolean dataDefinitionIgnoredInTransactions() {
        return true;
    }

    @Override
    public ResultSet getProcedures(String catalog, String schemaPattern, String procedureNamePattern) {
        return null;
    }

    @Override
    public ResultSet getProcedureColumns(String catalog, String schemaPattern, String procedureNamePattern, String columnNamePattern) {
        return null;
    }

    @Override
    public ResultSet getTables(String catalog, String schemaPattern, String tableNamePattern, String[] types) {
        return null;
    }

    @Override
    public ResultSet getSchemas() {
        return null;
    }

    @Override
    public ResultSet getCatalogs() {
        return null;
    }

    @Override
    public ResultSet getTableTypes() {
        return null;
    }

    @Override
    public ResultSet getColumns(String catalog, String schemaPattern, String tableNamePattern, String columnNamePattern) {
        return null;
    }

    @Override
    public ResultSet getColumnPrivileges(String catalog, String schema, String table, String columnNamePattern) {
        return null;
    }

    @Override
    public ResultSet getTablePrivileges(String catalog, String schemaPattern, String tableNamePattern) {
        return null;
    }

    @Override
    public ResultSet getBestRowIdentifier(String catalog, String schema, String table, int scope, boolean nullable) {
        return null;
    }

    @Override
    public ResultSet getVersionColumns(String catalog, String schema, String table) {
        return null;
    }

    @Override
    public ResultSet getPrimaryKeys(String catalog, String schema, String table) {
        return null;
    }

    @Override
    public ResultSet getImportedKeys(String catalog, String schema, String table) {
        return null;
    }

    @Override
    public ResultSet getExportedKeys(String catalog, String schema, String table) {
        return null;
    }

    @Override
    public ResultSet getCrossReference(String parentCatalog, String parentSchema, String parentTable, String foreignCatalog, String foreignSchema, String foreignTable) {
        return null;
    }

    @Override
    public ResultSet getTypeInfo() {
        return null;
    }

    @Override
    public ResultSet getIndexInfo(String catalog, String schema, String table, boolean unique, boolean approximate) {
        return null;
    }

    @Override
    public boolean supportsResultSetType(int type) {
        return false;
    }

    @Override
    public boolean supportsResultSetConcurrency(int type, int concurrency) {
        return false;
    }

    @Override
    public boolean ownUpdatesAreVisible(int type) {
        return false;
    }

    @Override
    public boolean ownDeletesAreVisible(int type) {
        return false;
    }

    @Override
    public boolean ownInsertsAreVisible(int type) {
        return false;
    }

    @Override
    public boolean othersUpdatesAreVisible(int type) {
        return false;
    }

    @Override
    public boolean othersDeletesAreVisible(int type) {
        return false;
    }

    @Override
    public boolean othersInsertsAreVisible(int type) {
        return false;
    }

    @Override
    public boolean updatesAreDetected(int type) {
        return false;
    }

    @Override
    public boolean deletesAreDetected(int type) {
        return false;
    }

    @Override
    public boolean insertsAreDetected(int type) {
        return false;
    }

    @Override
    public boolean supportsBatchUpdates() {
        return false;
    }

    @Override
    public ResultSet getUDTs(String catalog, String schemaPattern, String typeNamePattern, int[] types) {
        return null;
    }

    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public boolean supportsSavepoints() {
        return false;
    }

    @Override
    public boolean supportsNamedParameters() {
        return false;
    }

    @Override
    public boolean supportsMultipleOpenResults() {
        return false;
    }

    @Override
    public boolean supportsGetGeneratedKeys() {
        return false;
    }

    @Override
    public ResultSet getSuperTypes(String catalog, String schemaPattern, String typeNamePattern) {
        return null;
    }

    @Override
    public ResultSet getSuperTables(String catalog, String schemaPattern, String tableNamePattern) {
        return null;
    }

    @Override
    public ResultSet getAttributes(String catalog, String schemaPattern, String typeNamePattern, String attributeNamePattern) {
        return null;
    }

    @Override
    public boolean supportsResultSetHoldability(int holdability) {
        return false;
    }

    @Override
    public int getResultSetHoldability() {
        return 0;
    }

    @Override
    public int getDatabaseMajorVersion() {
        return 0;
    }

    @Override
    public int getDatabaseMinorVersion() {
        return 0;
    }

    @Override
    public int getJDBCMajorVersion() {
        return 0;
    }

    @Override
    public int getJDBCMinorVersion() {
        return 0;
    }

    @Override
    public int getSQLStateType() {
        return sqlStateSQL;
    }

    @Override
    public boolean locatorsUpdateCopy() {
        return false;
    }

    @Override
    public boolean supportsStatementPooling() {
        return false;
    }

    @Override
    public RowIdLifetime getRowIdLifetime() {
        return null;
    }

    @Override
    public ResultSet getSchemas(String catalog, String schemaPattern) {
        return null;
    }

    @Override
    public boolean supportsStoredFunctionsUsingCallSyntax() {
        return false;
    }

    @Override
    public boolean autoCommitFailureClosesAllResultSets() {
        return false;
    }

    @Override
    public ResultSet getClientInfoProperties() {
        return null;
    }

    @Override
    public ResultSet getFunctions(String catalog, String schemaPattern, String functionNamePattern) {
        return null;
    }

    @Override
    public ResultSet getFunctionColumns(String catalog, String schemaPattern, String functionNamePattern, String columnNamePattern) {
        return null;
    }

    @Override
    public ResultSet getPseudoColumns(String catalog, String schemaPattern, String tableNamePattern, String columnNamePattern) {
        return null;
    }

    @Override
    public boolean generatedKeyAlwaysReturned() {
        return false;
    }

    @Override
    public <T> T unwrap(Class<T> iface) {
        return null;
    }

    @Override
    public boolean isWrapperFor(Class<?> iface) {
        return false;
    }
}
