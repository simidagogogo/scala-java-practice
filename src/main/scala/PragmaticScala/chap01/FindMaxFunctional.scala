package PragmaticScala.chap01

/**
 * @author zhangda
 * @date 2021/3/13 00:16
 * @note
 */
object FindMaxFunctional {

  def findMax(temperatures: List[Int]) = {
    temperatures.foldLeft(Integer.MIN_VALUE){Math.max}
  }

  def main(args: Array[String]): Unit = {
    val temperatures = List(12, 14, 32)
    val highTemperatures = findMax(temperatures)

    println(s"highTemperatures = ${highTemperatures}")
  }

}
