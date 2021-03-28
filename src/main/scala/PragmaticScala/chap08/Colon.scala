package PragmaticScala.chap08

/**
 * @author zhangda
 * @date 2021/3/28 16:10
 * @note  方法名约定
 */


class Cow {
  // 对Cow的实例调用
  def ^(moon: Moon): Unit = println("Cow junped over the mooon.")
}

class Moon {
  // 对Moon的实例调用
  def ^:(cow: Cow): Unit = println("This cow junped over the mooon too.")
}

object Colon extends App {
  val cow = new Cow
  val moon = new Moon

  cow ^ moon
  cow ^: moon
//  moon.^:(cow)
}
