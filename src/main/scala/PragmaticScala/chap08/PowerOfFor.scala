package PragmaticScala.chap08

/**
 * @author zhangda
 * @date 2021/3/22 22:24
 * @note
 */
object PowerOfFor {
  def main(args: Array[String]): Unit = {
    val doubleEven = for (i <- 1 to 10; if i % 2 == 0)
      yield i * 2

    println(doubleEven.toArray.getClass)
    println(doubleEven)

  }
}
