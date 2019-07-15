package com.a_hacker.sparketl.loaders

import org.apache.spark.sql.DataFrame

abstract class Loader(){
    def load(df: DataFrame): Unit
}