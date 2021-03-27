package PragmaticScala.chap06


import java.io._
import scala.sys.process._
/**
 * @author zhangda
 * @date 2021/3/28 00:35
 * @note
 */
object WriteToFile {
  def writeToFile(fileName: String)(codeBlock: PrintWriter => Unit): Unit = {
    val writer = new PrintWriter(new File(fileName))
    try {
      println("begin write file....")
      codeBlock(writer)
    } finally {
      println("close write file....")
      writer.close()
    }
  }

  def main(args: Array[String]): Unit = {
    writeToFile("./src/main/scala/PragmaticScala/chap06/output.txt") {writer =>
      writer.write("hello from scala --smd.")
    }
  }
}
