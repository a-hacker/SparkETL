package com.a_hacker.sparketl.extractors

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.SparkSession

case class CSVExtractor(spark: SparkSession, file: String) extends Extractor(spark) {

    override def extract(): DataFrame = {
        spark.read.format("csv").load(file)
    }
}