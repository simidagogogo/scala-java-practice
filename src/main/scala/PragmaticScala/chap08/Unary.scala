package PragmaticScala.chap08

import java.awt.image.SampleModel

/**
 * @author zhangda
 * @date 2021/3/28 16:16
 * @note  不理解为什么会存在这种映射
 */
class Sample {
  def unary_+(): Unit = println("Called unary +")
  def unary_-(): Unit = println("Called unary -")
  def unary_!(): Unit = println("Called unary !")
  def unary_~(): Unit = println("Called unary ~")
}

object Unary extends App {
  val sample = new Sample
  +sample
  -sample
  !sample
  ~sample

  //  Called unary +
  //  Called unary -
  //  Called unary !
  //  Called unary ~
}
