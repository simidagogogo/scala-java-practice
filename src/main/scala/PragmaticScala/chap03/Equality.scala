package PragmaticScala.chap03

/**
 * @author zhangda
 * @date 2021/3/16 23:57
 * @note
 */
object Equality {

  def main(args: Array[String]): Unit = {
    val str1 = "hello"
    val str2 = "hello"
    val str3 = new String("hello")

    println(str1 == str2)
    println(str1 eq str2)
    println(str1 == str3)
    println(str1 eq str3)

  }
}
