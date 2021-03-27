package PragmaticScala.chap06


import java.util.Date
/**
 * @author zhangda
 * @date 2021/3/27 23:55
 * @note 部分应用函数
 */
object Log {

  def log(date: Date, message: String): Unit = {
    println(s"$date ----- $message")
  }

  def main(args: Array[String]): Unit = {
    val date = new Date(1420095600000L)
    log(date, "msg1")
    log(date, "msg2")
    log(date, "msg3")

    // 使用_将第二个参数标记为未绑定, 生成部分应用函数
    val logWithDateBound = log(date, _:String)
    logWithDateBound("msg1")
    logWithDateBound("msg2")
    logWithDateBound("msg3")
  }
}
