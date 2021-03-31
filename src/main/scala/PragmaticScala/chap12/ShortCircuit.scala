package PragmaticScala.chap12

/**
 * @author zhangda
 * @date 2021/3/30 12:35
 * @note
 */
object ShortCircuit {

  def expensiveCompution(): Boolean = {
    println("...assume slow operation...")
    false
  }

  def evaluate(input: Int): Unit = {
    println(s"evaluate called with $input")
    if (input >= 10 && expensiveCompution()) {
      println("doing work...")
    } else {
      println("skipping")
    }
  }

  def main(args: Array[String]): Unit = {
    evaluate(0)
    evaluate(100)
  }
}
