package com.a_hacker.sparketl.transformers

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.SparkSession

abstract class Transformer(spark: SparkSession){
    def transform: DataFrame
}