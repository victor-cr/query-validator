package org.springframework.jdbc.core.namedparam

class BaseNamedParameterJdbcTemplate extends NamedParameterJdbcTemplate(new FakeJdbcOperations()) {
  def toNames(paramSource: SqlParameterSource): Seq[String] = {

  }
}
