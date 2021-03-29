package PragmaticScala.chap11

/**
 * @author zhangda
 * @date 2021/3/29 22:55
 * @note 蹦床调用
 */
object Words {

  import scala.io.Source._

  def explore(count: Int, words: List[String]):Int = {
    // 递归终止条件
    if (words.isEmpty)
      return count

    // 下探
    countPalindrome(count, words)
  }

  def countPalindrome(count: Int, words: List[String]):Int = {
    var inc_count = count
    if (words.head.reverse == words.head)
      inc_count += 1

    // 下探
    explore(inc_count, words.tail)
  }

  def callExplore(text: String): Unit = println(explore(0, text.split(" ").toList))

  def main(args: Array[String]): Unit = {
    // test 1
    callExplore("dad mom and racecar")
    val source = fromURL("https://en.wikipedia.org/wiki/Gettysburg_Address")

    // test2 - java.lang.StackOverflowError
    try {
      callExplore(source.mkString)
    } catch {
      case ex: Throwable => println(ex)
    } finally {
      source.close()
    }
  }
}
