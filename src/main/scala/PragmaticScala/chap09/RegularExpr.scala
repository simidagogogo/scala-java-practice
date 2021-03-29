package PragmaticScala.chap09

/**
 * @author zhangda
 * @date 2021/3/28 23:16
 * @note
 */
object RegularExpr extends App {
  import scala.util.matching.Regex
  val pattern = "(S|s)cala".r
  val str: String = "Scala is scalable and cool"
  println(pattern.findFirstIn(str))
  println(pattern.findAllIn(str).mkString(", "))
  println("cool".r.replaceFirstIn(str, "awesome"))
}
