package PragmaticScalaJava.chap01

/**
 * @author zhangda
 * @date 2021/3/13 00:13
 * @note
 */
object JavaFindMaxImperative {

  def findMax(temperatures: List[Int]) = {
    var highTemperature = Integer.MIN_VALUE

    for (temperature <- temperatures) {
      highTemperature = Math.max(highTemperature, temperature)
    }

    highTemperature
  }


  def main(args: Array[String]): Unit = {
    val temperatures = List(12, 34, 23)

    val highTemperature = findMax(temperatures)
    println(s"highTemperature = ${highTemperature}")
  }
}
