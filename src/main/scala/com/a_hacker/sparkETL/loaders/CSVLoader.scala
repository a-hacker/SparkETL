package com.a_hacker.sparketl.loaders

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.SparkSession

case class CSVLoader(file: String) extends Loader() {

    override def load(df: DataFrame): Unit = {
        df.write.csv(file)
    }
}