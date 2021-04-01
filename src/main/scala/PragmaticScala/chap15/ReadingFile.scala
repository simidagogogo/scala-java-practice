package PragmaticScala.chap15

/**
 * @author zhangda
 * @date 2021/4/1 12:34
 * @note
 */
object ReadingFile extends  App {

  import scala.io.Source
  println("*** The content of the file you read is: ")
  var code = Source.fromFile("/Users/zhangda/Documents/GitHub/scala-java-practice/src/main/scala/PragmaticScala/chap15/ReadingFile.scala")
//  code.foreach(print)

  // getLines该怎么用?
  while (code.hasNext) {
    println(code.getLines().toString())
    code.next()
  }

//  println("=====================")
//  code = Source.fromFile("/Users/zhangda/Documents/GitHub/scala-java-practice/src/main/scala/PragmaticScala/chap15/ReadingFile.scala")
//  println(code.mkString)
}
