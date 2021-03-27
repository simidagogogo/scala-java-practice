package PragmaticScala.chap04

/**
 * @author zhangda
 * @date 2021/3/20 19:59
 * @note
 */
class Construct(param: String) {
  println(s"Creating an instance of Construct with parameter $param")
}

object Construct extends App{
  println("Let's create an instance")
  new Construct("sample")
}