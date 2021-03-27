package PragmaticScala.chap05

/**
 * @author zhangda
 * @date 2021/3/27 13:25
 * @note
 */
object OptionExample {

  def commentOnPractice(input: String) = {
    if (input == "test") {
      Some("good")
    } else {
      None
    }
  }

  def main(args: Array[String]): Unit = {
    for (input <- Set("test", "hack")) {
      val comment = commentOnPractice(input)
      val commentDisplay = comment.getOrElse("Found no comments")
      println(s"input : $input, comment: $commentDisplay")
    }
    //input : test, comment: good
    //input : hack, comment: Found no comments
  }
}
