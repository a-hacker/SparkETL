package com.a_hacker.sparketl.extractors

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.SparkSession

abstract class Extractor(spark: SparkSession){

    def extract: DataFrame
}