package PragmaticScala.chap14

/**
 * @author zhangda
 * @date 2021/4/3 16:32
 * @note
 */
abstract class BirdWithProblem {
  @throws(classOf[NoFlyException]) def fly(): Unit
}

class NoFlyException extends Exception {}

class Ostrich extends BirdWithProblem {
  override def fly(): Unit = {
    throw new NoFlyException
  }
}

object BirdWithProblem {
  def main(args: Array[String]): Unit = {
    val ostrich = new Ostrich
    ostrich.fly()
  }
}