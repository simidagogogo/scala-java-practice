package PragmaticScala.chap07

import java.io.{StringReader, StringWriter}

/**
 * @author zhangda
 * @date 2021/3/28 10:45
 * @note
 */
abstract class Writer {
  def writeMessage(message: String): Unit
}

trait UpperCaseWriter extends Writer {
  abstract override def writeMessage(message: String): Unit =
    super.writeMessage(message.toUpperCase)
}


trait ProfanityFilteredWriter extends Writer {
  abstract override def writeMessage(message: String): Unit =
    super.writeMessage(message.replace("stupid", "s-----"))
}

class StringWriterDelegate extends Writer {
  val writer = new StringWriter

  def writeMessage(message: String): Unit = writer.write(message)

  override def toString: String = writer.toString
}


object MethodBinding extends App {
  val myWriterProfanityFirst = new StringWriterDelegate with UpperCaseWriter with ProfanityFilteredWriter

  val myWriterProfanityLast = new StringWriterDelegate with ProfanityFilteredWriter with UpperCaseWriter

  myWriterProfanityFirst.writeMessage("There is no sin except stupidity")
  myWriterProfanityLast.writeMessage("There is no sin except stupidity")

  println(s"myWriterProfanityFirst = ${myWriterProfanityFirst}")
  println(s"myWriterProfanityLast = ${myWriterProfanityLast}")
}

