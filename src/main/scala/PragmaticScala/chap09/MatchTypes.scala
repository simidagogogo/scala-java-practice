package PragmaticScala.chap09

/**
 * @author zhangda
 * @date 2021/3/28 17:52
 * @note 匹配类型和守卫
 */
object MatchTypes {
  def process(input: Any) = {
    input match {
      case (_: Int, _:Int) => println("Processing (int, int)...")
      case (_:Double, _:Double) => println("Processing (double, double)...")
      case msg: Int if msg > 1000 => println("Processing int > 10000")
      case _: Int => println("Processing int...")
      case _: String => println("Processing string...")
      case _ => println(s"Can't handle $input")
    }
  }

  def main(args: Array[String]): Unit = {
    process((12.4, -23.23))
    process(0)
    process(100012)
    process("simida")
    process(1.2)
  }

//  Processing (double, double)...
//  Processing int...
//  Processing int > 10000
//  Processing string...
//  Can't handle 1.2
}
