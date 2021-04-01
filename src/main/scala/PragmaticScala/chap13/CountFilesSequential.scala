package PragmaticScala.chap13

/**
 * @author zhangda
 * @date 2021/3/30 00:20
 * @note  广度优先搜索算法的实例, 经典!
 */
object CountFilesSequential {

  import java.io.File

  def getChildren(file: File): List[File] = {
    val children = file.listFiles()
    if (children != null) {
      children.toList
    } else {
      List()
    }
  }


  def main(args: Array[String]): Unit = {
    val dir = "/Users/zhangda/Documents/GitHub/scala-java-practice/src/main/scala/PragmaticScala"

    val start = System.nanoTime()
    val exploreFromm = new File(dir)
//    println(s"file.getAbsolutePath = ${file.getAbsolutePath}")
//    println(s"file.getCanonicalPath = ${file.getCanonicalPath}")
//    println(s"file.getParent = ${file.getParent}")
//    println(s"file.getFreeSpace = ${file.getFreeSpace}")
//    println(s"file.getTotalSpace = ${file.getTotalSpace}")
//    println(s"file.getUsableSpace = ${file.getUsableSpace}")
//
//
//    println(s"file.exists() = ${file.exists()}")
//    println(s"file.getAbsoluteFile = ${file.getAbsoluteFile}")
//    println(s"file.isDirectory = ${file.isDirectory}")
//    println(s"file.isFile = ${file.isFile}")
//    println(s"file.list() = ${file.list().mkString(", ")}")
//    println(s"file.listFiles() = ${file.listFiles().mkString(", ")}")
    var count = 0L
    var filesToVisit = List(exploreFromm)

    while (filesToVisit.nonEmpty) {
      val head = filesToVisit.head
      filesToVisit = filesToVisit.tail

      val children = getChildren(head)
      count += children.count(!_.isDirectory)
      filesToVisit = filesToVisit ::: children.filter(_.isDirectory)
    }

    val end = System.nanoTime()
    println(s"Number of files found: $count")
    println(s"Time taken: ${(end - start) / 1.0e9} seconds")
  }
}
