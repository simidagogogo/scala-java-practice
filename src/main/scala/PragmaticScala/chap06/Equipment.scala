package PragmaticScala.chap06

/**
 * @author zhangda
 * @date 2021/3/27 23:30
 * @note
 */
// 可以将函数值作为一个参数传递给构造器
class Equipment(val routine: Int => Int) {

  // 这是委托模式么?
  def simulate(input: Int): Int = {
    print("Running simulation....")
    routine(input)
  }
}


object EquipmentUseNotDry {
  val equipment1 = new Equipment({input => print(s"calc   with $input"); input})
  val equipment2 = new Equipment({input => print(s"calc   with $input"); input})

  equipment1.simulate(4)
  equipment2.simulate(6)
}

object EquipmentUseDry extends App {
  val calculator = {input: Int => print(s"calc with $input"); input}

  val equipment1 = new Equipment(calculator)
  val equipment2 = new Equipment(calculator)

  equipment1.simulate(4)
  equipment2.simulate(6)
}