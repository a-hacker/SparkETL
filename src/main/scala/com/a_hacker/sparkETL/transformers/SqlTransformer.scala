package com.a_hacker.sparketl.transformers

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.DataFrame
import scala.io.Source

case class SqlTransformer(spark: SparkSession, fileName: String) extends Transformer(spark) {

    override def transform(): DataFrame = {
        val sqlText = Source.fromResource(fileName).getLines.mkString
        spark.sql(sqlText)
    }
}