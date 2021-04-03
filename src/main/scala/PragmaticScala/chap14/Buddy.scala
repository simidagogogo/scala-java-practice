package PragmaticScala.chap14

/**
 * @author zhangda
 * @date 2021/4/3 16:19
 * @note
 */
class Buddy {
  def greet(): Unit = {
    println("Hello from Buddy class")
  }
}

object Buddy {
  def greet(): Unit = {
    println("Hello from Buddy object")
  }
}
