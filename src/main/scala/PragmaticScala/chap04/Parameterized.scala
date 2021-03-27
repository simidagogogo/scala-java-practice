package PragmaticScala.chap04

import sun.misc.resources.Messages_sv

/**
 * @author zhangda
 * @date 2021/3/26 22:48
 * @note
 */
object Parameterized extends App {
  def echo[T](input1: T, input2: T) = {
    println(s"got $input1 (${input1.getClass}) $input2  (${input2.getClass})")
  }

  def echo2[T1, T2](input1: T1, input2: T2) = {
    println(s"received $input1 (${input1.getClass}) and $input2(${input2.getClass}) " )
  }

  echo("hello", "there")
  echo(4, 5)
  echo(4, "hi") // 可以运行
//  echo[Int]("hi", 5)

  echo2("Hi", "5")
  echo2("Hi", 5)

}


class Message[T](val content: T) {
  override def toString: String = s"message content is $content (${content.getClass})"

  def is(value: T) = {
    value == content
  }
}

object Message {
  def main(args: Array[String]): Unit = {
    val message1: Message[String] = new Message("howdy")
    val message2 = new Message(42)

    println(message1)
    println(message2)
    println(message1.is("howdy"))
    println(message1.is("hi"))
    println(message2.is(22))

  }
}
