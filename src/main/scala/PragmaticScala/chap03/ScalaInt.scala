package PragmaticScala.chap03

import java.util

/**
 * @author zhangda
 * @date 2021/3/15 23:18
 * @note  Scala和Java的类型兼容性
 */
object ScalaInt {
  def playWithInt() = {
    val capacity: Int = 10
    val list = new util.ArrayList[String]()

    // Scala默默地将Scala.Int视为Java基本类型int.这是纯粹的编译器转换,故而在运行时没有性能损失.
    list.ensureCapacity(capacity)
  }

  def main(args: Array[String]): Unit = {
    playWithInt()
  }
}
