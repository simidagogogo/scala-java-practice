package PragmaticScala.chap09

/**
 * @author zhangda
 * @date 2021/3/28 23:23
 * @note
 * ^  打头字符
 * \d 匹配一个数字
 * \. 匹配.
 * +  至少一个
 * *  0或者1个或者多个
 *
 */
object MatchUsingRegex {
  def process(input: String) = {
    val GoogStock = """^GOOG:(\d*\.\d+)""".r
    input match {
      case GoogStock(price) => println(s"Price of GOOG is $$$price")
      case _ => println(s"not processing $input")
    }
  }

  def process2(input: String) = {
    // 匹配任何字符或者数字开头,后面跟着一个冒号,然后是整的十进制数结束的任何字符串
    val MatchStock = """^(.+):(\d*\.\d+)""".r
    input match {
      case MatchStock("GOOG", price) => println(s"We got GOOG at $$$price")
      case MatchStock("IBM", price) => println(s"IBM's trading at $$$price")
      case MatchStock(symbol, price) => println(s"Price of $symbol is $$$price")
      case _ => println(s"not processing $input")
    }
  }


  def main(args: Array[String]): Unit = {
    process("GOOG:310.98")
    process(s"GOOG:310")
    process("IBM:84.01")
    println("------------------")

    process2("GOOG:310.32")
    process2("IBM:84.10")
    process2("GE:15.98")
  }
}
