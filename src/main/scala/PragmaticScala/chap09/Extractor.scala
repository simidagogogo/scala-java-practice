package PragmaticScala.chap09

/**
 * @author zhangda
 * @date 2021/3/22 22:51
 * @note
 */
object Extractor {
  def unapply(input: String): Option[(String, Double)] = {
    try {
      if (input.contains(":")) {
        val splitQuote = input.split(":")
        Some((splitQuote(0), splitQuote(1).toDouble))
      } else {
        None
      }
    } catch {
      case _: NumberFormatException => None
    }
  }

  def main(args: Array[String]): Unit = {
    println("123456")
    Thread.sleep(10000)
    println("789")
  }
}
