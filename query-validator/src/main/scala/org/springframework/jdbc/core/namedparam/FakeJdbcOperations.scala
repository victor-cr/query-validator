package org.springframework.jdbc.core.namedparam

import java.util

import org.springframework.jdbc.core._
import org.springframework.jdbc.support.KeyHolder
import org.springframework.jdbc.support.rowset.SqlRowSet

class FakeJdbcOperations extends JdbcOperations {
  override def execute[T](action: ConnectionCallback[T]): T = null.asInstanceOf[T]

  override def execute[T](action: StatementCallback[T]): T = null.asInstanceOf[T]

  override def execute(sql: String): Unit = {}

  override def query[T](sql: String, rse: ResultSetExtractor[T]): T = null.asInstanceOf[T]

  override def query(sql: String, rch: RowCallbackHandler): Unit = {}

  override def query[T](sql: String, rowMapper: RowMapper[T]): util.List[T] = new util.ArrayList[T]()

  override def queryForObject[T](sql: String, rowMapper: RowMapper[T]): T = null.asInstanceOf[T]

  override def queryForObject[T](sql: String, requiredType: Class[T]): T = null.asInstanceOf[T]

  override def queryForMap(sql: String): util.Map[String, AnyRef] = new util.HashMap[String, AnyRef]()

  override def queryForList[T](sql: String, elementType: Class[T]): util.List[T] = new util.ArrayList[T]()

  override def queryForList(sql: String): util.List[util.Map[String, AnyRef]] = new util.ArrayList[util.Map[String, AnyRef]]()

  override def queryForRowSet(sql: String): SqlRowSet = null.asInstanceOf[SqlRowSet]

  override def update(sql: String): Int = 0

  override def batchUpdate(sql: String*): Array[Int] = Array()

  override def execute[T](psc: PreparedStatementCreator, action: PreparedStatementCallback[T]): T = null.asInstanceOf[T]

  override def execute[T](sql: String, action: PreparedStatementCallback[T]): T = null.asInstanceOf[T]

  override def query[T](psc: PreparedStatementCreator, rse: ResultSetExtractor[T]): T = null.asInstanceOf[T]

  override def query[T](sql: String, pss: PreparedStatementSetter, rse: ResultSetExtractor[T]): T = null.asInstanceOf[T]

  override def query[T](sql: String, args: Array[AnyRef], argTypes: Array[Int], rse: ResultSetExtractor[T]): T = null.asInstanceOf[T]

  override def query[T](sql: String, args: Array[AnyRef], rse: ResultSetExtractor[T]): T = null.asInstanceOf[T]

  override def query[T](sql: String, rse: ResultSetExtractor[T], args: AnyRef*): T = null.asInstanceOf[T]

  override def query(psc: PreparedStatementCreator, rch: RowCallbackHandler): Unit = {}

  override def query(sql: String, pss: PreparedStatementSetter, rch: RowCallbackHandler): Unit = {}

  override def query(sql: String, args: Array[AnyRef], argTypes: Array[Int], rch: RowCallbackHandler): Unit = {}

  override def query(sql: String, args: Array[AnyRef], rch: RowCallbackHandler): Unit = {}

  override def query(sql: String, rch: RowCallbackHandler, args: AnyRef*): Unit = {}

  override def query[T](psc: PreparedStatementCreator, rowMapper: RowMapper[T]): util.List[T] = new util.ArrayList[T]()

  override def query[T](sql: String, pss: PreparedStatementSetter, rowMapper: RowMapper[T]): util.List[T] = new util.ArrayList[T]()

  override def query[T](sql: String, args: Array[AnyRef], argTypes: Array[Int], rowMapper: RowMapper[T]): util.List[T] = new util.ArrayList[T]()

  override def query[T](sql: String, args: Array[AnyRef], rowMapper: RowMapper[T]): util.List[T] = new util.ArrayList[T]()

  override def query[T](sql: String, rowMapper: RowMapper[T], args: AnyRef*): util.List[T] = new util.ArrayList[T]()

  override def queryForObject[T](sql: String, args: Array[AnyRef], argTypes: Array[Int], rowMapper: RowMapper[T]): T = null.asInstanceOf[T]

  override def queryForObject[T](sql: String, args: Array[AnyRef], rowMapper: RowMapper[T]): T = null.asInstanceOf[T]

  override def queryForObject[T](sql: String, rowMapper: RowMapper[T], args: AnyRef*): T = null.asInstanceOf[T]

  override def queryForObject[T](sql: String, args: Array[AnyRef], argTypes: Array[Int], requiredType: Class[T]): T = null.asInstanceOf[T]

  override def queryForObject[T](sql: String, args: Array[AnyRef], requiredType: Class[T]): T = null.asInstanceOf[T]

  override def queryForObject[T](sql: String, requiredType: Class[T], args: AnyRef*): T = null.asInstanceOf[T]

  override def queryForMap(sql: String, args: Array[AnyRef], argTypes: Array[Int]): util.Map[String, AnyRef] = null.asInstanceOf[T]

  override def queryForMap(sql: String, args: AnyRef*): util.Map[String, AnyRef] = new util.HashMap[String, AnyRef]()

  override def queryForList[T](sql: String, args: Array[AnyRef], argTypes: Array[Int], elementType: Class[T]): util.List[T] = new util.ArrayList[T]()

  override def queryForList[T](sql: String, args: Array[AnyRef], elementType: Class[T]): util.List[T] = new util.ArrayList[T]()

  override def queryForList[T](sql: String, elementType: Class[T], args: AnyRef*): util.List[T] = new util.ArrayList[T]()

  override def queryForList(sql: String, args: Array[AnyRef], argTypes: Array[Int]): util.List[util.Map[String, AnyRef]] = new util.ArrayList[util.Map[String, AnyRef]]()

  override def queryForList(sql: String, args: AnyRef*): util.List[util.Map[String, AnyRef]] = new util.ArrayList[util.Map[String, AnyRef]]()

  override def queryForRowSet(sql: String, args: Array[AnyRef], argTypes: Array[Int]): SqlRowSet = null.asInstanceOf[SqlRowSet]

  override def queryForRowSet(sql: String, args: AnyRef*): SqlRowSet = null.asInstanceOf[SqlRowSet]

  override def update(psc: PreparedStatementCreator): Int = 0

  override def update(psc: PreparedStatementCreator, generatedKeyHolder: KeyHolder): Int = 0

  override def update(sql: String, pss: PreparedStatementSetter): Int = 0

  override def update(sql: String, args: Array[AnyRef], argTypes: Array[Int]): Int = 0

  override def update(sql: String, args: AnyRef*): Int = 0

  override def batchUpdate(sql: String, pss: BatchPreparedStatementSetter): Array[Int] = Array()

  override def batchUpdate(sql: String, batchArgs: util.List[Array[AnyRef]]): Array[Int] = Array()

  override def batchUpdate(sql: String, batchArgs: util.List[Array[AnyRef]], argTypes: Array[Int]): Array[Int] = Array()

  override def batchUpdate[T](sql: String, batchArgs: util.Collection[T], batchSize: Int, pss: ParameterizedPreparedStatementSetter[T]): Array[Array[Int]] = Array()

  override def execute[T](csc: CallableStatementCreator, action: CallableStatementCallback[T]): T = null.asInstanceOf[T]

  override def execute[T](callString: String, action: CallableStatementCallback[T]): T = null.asInstanceOf[T]

  override def call(csc: CallableStatementCreator, declaredParameters: util.List[SqlParameter]): util.Map[String, AnyRef] = new util.HashMap[String, AnyRef]()
}
