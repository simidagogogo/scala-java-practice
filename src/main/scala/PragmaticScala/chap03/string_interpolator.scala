package PragmaticScala.chap03

/**
 * @author zhangda
 * @date 2021/3/16 23:35
 * @note
 */
object string_interpolator {

  def main(args: Array[String]): Unit = {

    val product = "macbook pro"
    val discount = 10
    val price = 9999

    println(s"The amount after discount is $$${price * (1 - discount / 100.0)}")
    println(f"On $product $discount%% saves $$${price * discount / 100.00}%2.2f")
  }
}
