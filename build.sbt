name := "DD_DBUtils_Spark3Scala2.12"

version := "0.1"

scalaVersion := "2.12.15" //2.12.10
val sparkVersion = "3.0.1"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-sql" % sparkVersion,
  "com.databricks" %% "dbutils-api" % "0.0.5"
)
