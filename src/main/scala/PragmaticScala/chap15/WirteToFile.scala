package PragmaticScala.chap15

/**
 * @author zhangda
 * @date 2021/3/31 08:50
 * @note
 */
object WirteToFile extends  App {
  import java.io._

  val writer = new PrintWriter(new File("symbols.txt"))
  writer.write("APPL")
  writer.close()
  println(scala.io.Source.fromFile("symbols.txt").mkString)
}
