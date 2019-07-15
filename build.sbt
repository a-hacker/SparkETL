import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.a_hacker"
ThisBuild / organizationName := "a-hacker"

lazy val root = (project in file("."))
  .settings(
    name := "SparkETL",
    libraryDependencies ++= Seq(
      scalaTest % Test,
      sparkSql
    ),
    resolvers ++= Seq(
      "Apache Repository" at "https://repository.apache.org/content/repositories/releases/",
    )
  )