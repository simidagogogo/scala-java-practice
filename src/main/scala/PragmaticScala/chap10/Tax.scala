package PragmaticScala.chap10

/**
 * @author zhangda
 * @date 2021/3/28 23:39
 * @note
 */
object Tax {
  def taxFor(amount: Double) = {
    if (amount < 0) {
      throw new IllegalArgumentException("Amount must be greater then zero")
    }

    if (amount < 0.01) {
      throw new RuntimeException("Amount too small to be taxed")
    }

    if (amount > 1000000) {
      throw new Exception("Amount too large...")
    }

    amount * 0.8
  }

  def main(args: Array[String]): Unit = {
    for (amount <- List(100.0, 0.009, -2.0, 100000001.0)) {
      try {
        println(s"Amount: $$$amount")
        println(s"Tax: $$${Tax.taxFor(amount)}")
      } catch {
        case ex: IllegalArgumentException => println(ex.getMessage)
        case ex: RuntimeException => println(s"Don't bother reproting ...${ex.getMessage}")
        // 没有处理Exception异常,会导致程序终止,并打印栈追踪信息
        // 如果想要捕获任何抛出的异常,可以捕获Throwable. 如果不关心异常的详细信息,可以使用_代替变量名.
        case _: Throwable => println("Something went wrong")
      } finally {
        // finally的执行, 与try代码块中的代码是否抛出异常无关, 一定会被执行
        println("---------------")
      }
    }
  }

}
