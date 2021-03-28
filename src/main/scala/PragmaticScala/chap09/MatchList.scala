package PragmaticScala.chap09

/**
 * @author zhangda
 * @date 2021/3/28 15:02
 * @note
 */
object MatchList {

  def processItems(items: List[String]) = {
    items match {
      case List("apple", "ibm") => println("Apples and IBMs")
      case List("red", "blue", "white") => println("Stars and Stripes...")
      case List("red", "blue", _*) => println("colors red, blue,...")
      case List("apple", "orange", otherFruits @ _*) => println("apples, oranges, and " + otherFruits + otherFruits.getClass)
    }
  }

  def main(args: Array[String]): Unit = {
    processItems(List("apple", "ibm"))
    processItems(List("red", "blue", "green"))
    processItems(List("red", "blue", "white"))
    processItems(List("apple", "orange", "grapes", "dates"))
  }
  //  Apples and IBMs
  //  colors red, blue,...
  //  Stars and Stripes...
  //  apples, oranges, and List(grapes, dates)class scala.collection.immutable.$colon$colon
}
