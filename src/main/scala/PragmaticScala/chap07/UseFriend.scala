package PragmaticScala.chap07
/**
 * @author zhangda
 * @date 2021/3/28 10:05
 * @note
 */
object UseFriend extends App {
  val simida = new Man("simida")
  val lianmeng = new Woman("lianmeng")
  val dawang = new Dog("dawang")

  simida.listen()
  lianmeng.listen()
  dawang.listen()

  val mansBestFrined: Friend = dawang

  mansBestFrined.listen()

  def helpAsFriend(friend: Friend): Unit = friend.listen()

  helpAsFriend(simida)
  helpAsFriend(lianmeng)
}
