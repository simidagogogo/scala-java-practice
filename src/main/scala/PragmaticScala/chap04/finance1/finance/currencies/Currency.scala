package PragmaticScala.chap04.finance1.finance.currencies

/**
 * @author zhangda
 * @date 2021/3/18 13:06
 * @note 枚举类
 */

object Currency extends Enumeration {
  //  type Value = Currency
  type Currency = Value
  val CNY, GBP, INR, JAP, USD = Value // 使用关键字val定义枚举所选中的实例.
}
