package org.springframework.jdbc.core.namedparam

import org.springframework.jdbc.core.{JdbcTemplate, PreparedStatementCreator}

class FakeNamedParameterJdbcTemplate extends NamedParameterJdbcTemplate(new JdbcTemplate()) {
  override def getPreparedStatementCreator(sql: String, paramSource: SqlParameterSource): PreparedStatementCreator = {
    val simpleParsedSql = getParsedSql(sql)
  }
}
