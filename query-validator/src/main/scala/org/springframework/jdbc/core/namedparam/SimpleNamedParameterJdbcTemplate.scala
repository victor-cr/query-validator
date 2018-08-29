package org.springframework.jdbc.core.namedparam

import java.util

import org.springframework.jdbc.core.{PreparedStatementCreator, PreparedStatementCreatorFactory, SqlParameter}

class SimpleNamedParameterJdbcTemplate extends NamedParameterJdbcTemplate(new FakeJdbcOperations) {

  override def getPreparedStatementCreator(sql: String, paramSource: SqlParameterSource): PreparedStatementCreator = {
    val parsedSql: ParsedSql = getParsedSql(sql)

    if (parsedSql.getParameterNames.containsAll(paramSource.))

    val sqlToUse: String = NamedParameterUtils.substituteNamedParameters(parsedSql, paramSource)
    val params: Array[AnyRef] = NamedParameterUtils.buildValueArray(parsedSql, paramSource, null)
    val declaredParameters: util.List[SqlParameter] = NamedParameterUtils.buildSqlParameterList(parsedSql, paramSource)
    val pscf: PreparedStatementCreatorFactory = new PreparedStatementCreatorFactory(sqlToUse, declaredParameters)
    return pscf.newPreparedStatementCreator(params)

  }
}
