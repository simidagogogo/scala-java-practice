package PragmaticScala.chap09

/**
 * @author zhangda
 * @date 2021/3/28 14:59
 * @note
 */
object MatchTuples {
  def processCoordinates(input: Any) = {
    input match {
      case (lat, long) => printf("Processing (%d, %d)...\n", lat, long)
      case "done" => println("done")
      case _ => println("invalid input")
    }
  }

  def main(args: Array[String]): Unit = {
    processCoordinates((39, -104))
    processCoordinates("done")
  }
}
