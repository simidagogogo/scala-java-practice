package PragmaticScala.chap14

/**
 * @author zhangda
 * @date 2021/4/3 13:02
 * @note
 */

package automobiles

class Car(val year: Int) {
  private[this] var miles: Int = 0

  def drive(distance: Int) = {
    miles += distance
  }

  override def toString: String = s"year: $year imiles: $miles"
}
