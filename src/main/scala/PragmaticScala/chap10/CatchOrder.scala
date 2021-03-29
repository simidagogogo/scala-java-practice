package PragmaticScala.chap10

/**
 * @author zhangda
 * @date 2021/3/29 12:50
 * @note 注意catch的顺序
 */
object CatchOrder {
  def main(args: Array[String]): Unit = {
    val amount = -2
    try {
      println(s"Amount: $$$amount")
      println(s"Tax: $$${Tax.taxFor(amount)}")
    } catch {
      // 以下两句的顺序反了
      case _: Exception => println(s"Something went wrong.")
      case ex: IllegalArgumentException => println(ex.getMessage)
    }
  }
}
