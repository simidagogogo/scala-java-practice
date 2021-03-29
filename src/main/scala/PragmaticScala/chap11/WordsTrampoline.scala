package PragmaticScala.chap11

/**
 * @author zhangda
 * @date 2021/3/29 22:55
 * @note 蹦床调用
 */

object WordsTrampoline {

  import scala.io.Source._
  import scala.util.control.TailCalls.tailcall
  import scala.util.control.TailCalls.TailRec
  import scala.util.control.TailCalls.done

  def explore(count: Int, words: List[String]): TailRec[Int] = {
    // 递归终止条件
    if (words.isEmpty)
      return done(count)  // done表示终止

    // 下探
    tailcall(countPalindrome(count, words)) // tailcall表示继续
  }

  def countPalindrome(count: Int, words: List[String]): TailRec[Int] = {
    var inc_count = count
    if (words.head.reverse == words.head)
      inc_count += 1

    // 下探
    tailcall(explore(inc_count, words.tail))
  }

  def callExplore(text: String): Unit = println(explore(0, text.split(" ").toList).result) // result用于拆开包装

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
