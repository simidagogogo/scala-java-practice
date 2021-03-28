package PragmaticScala.chap09

/**
 * @author zhangda
 * @date 2021/3/28 19:21
 * @note
 */
object MatchWithField {

}

class Sample {
  val max = 100

  def process(input: Int) = {
    input match {
      case max => println(s"You matched max $max") // max被当做模式变量,而不是成员字段
      // case this.max => println(s"You matched max $max")   // max表示成员字段
    }
  }
}

object Sample extends App {
  val sample = new Sample

  try {
    sample.process(0)
  } catch {
    case ex: Throwable => println(ex)
  }
  sample.process(100)
}
