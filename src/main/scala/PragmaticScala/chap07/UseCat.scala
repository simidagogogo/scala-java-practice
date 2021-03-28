package PragmaticScala.chap07

/**
 * @author zhangda
 * @date 2021/3/28 10:22
 * @note
 */

object UseCat extends App {
  def useFriend(friend: Friend) = friend.listen()

  val angel = new Cat("Angel") with Friend
  val friend: Friend = angel
  angel.listen()

  useFriend(angel)
}
