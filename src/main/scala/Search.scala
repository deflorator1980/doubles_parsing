import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._

object Search{
  def main(args: Array[String]) {
        val sc = new SparkContext(new SparkConf().setAppName("Doubles").setMaster("local[4]"))

        sc.textFile("real_num_n.txt").flatMap(l => l.split("\n")).map(x => x.toDouble).zipWithIndex.filter(x => x._1.toInt == x._2).foreach(x => println(x._1))

  }
}
