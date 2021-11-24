package com.dd.dbutilspkg

import com.databricks.dbutils_v1.DBUtilsHolder.dbutils
import org.apache.spark.SparkContext
import org.apache.spark.sql.SparkSession

/* Configure Databricks Jar job
   * Type               : Jar
   * Main Class         : com.dd.dbutilspkg.dbutilsMain
   * Dependent Libraries: Jar physical path like "dbfs:/FileStore/<jar_file_name>.jar"
*/

/* Parameters For Spark Submit
["--class","com.dd.dbutilspkg.Main","dbfs:/FileStore/<jar_file_name>.jar"]
*/

object dbutilsMain {
  def main(args: Array[String]) {
    println("\n ========== Start of the jar dbutils_main & creating sparkSession From Jar ==========")
    val goodSparkContext = SparkContext.getOrCreate()
    val spark = SparkSession.builder().appName("DD DBUtils App").getOrCreate()

    println("\n", dbutils.fs.ls("dbfs:/tmp/test/"))

    // Get notebook context
    println("\n ====== get notebook context ======")
    val notebook_context = dbutils.notebook.getContext()
    println("notebook_context: ", notebook_context)
    println("\n notebook_context: ", notebook_context.toJson)

    println("\n ========== End of jar dbutils_main ==========")
  }
}