import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.8"
  lazy val sparkSql = "org.apache.spark" %% "spark-sql" % "2.4.3"
}