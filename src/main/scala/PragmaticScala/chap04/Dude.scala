package PragmaticScala.chap04

import scala.beans.BeanProperty

/**
 * @author zhangda
 * @date 2021/3/26 12:59
 * @note
 */
class Dude(@BeanProperty val firstname: String, val lastname: String) {
  @BeanProperty var postion: String = _
}
