package PragmaticScala.chap12

/**
 * @author zhangda
 * @date 2021/3/30 12:35
 * @note
 */
object ShortCircuit2 {

  def expensiveCompution(): Boolean = {
    println("...assume slow operation...")
    false
  }


  def evaluate(input: Int): Unit = {
    println(s"evaluate called with $input")

    // 将expensiveCompution()方法抽取到外面, 则不再惰性求值
//    val perform = expensiveCompution()
    lazy val perform = expensiveCompution()
    if (input >= 10 && perform) {
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
