//package PragmaticScala.chap03
//
///**
// * @author zhangda
// * @date 2021/3/15 23:49
// * @note 隐式参数
// */
//
//object ImplicitParameters {
//
//  class WiFI(name: String) {
//    override def toString: String = name
//  }
//
//  def connectToNetwork(user:String)(implicit wifi: WiFI) = {
//    println(s"User: $user connected to WIFI $wifi")
//  }
//
//  def atOffice() = {
//    println("--- at the office ---")
//    val cafeteriaNetwork = new WiFI("cafe-connect")
//    connectToNetwork("guest")(cafeteriaNetwork)
//
//    /** 将officeNetwork定义为def或者val都是一样的 */
//    implicit def officeNetwork: WiFI = new WiFI("office-network")
//    connectToNetwork("Jill Coder")
//    connectToNetwork("Joe Hacker")
//  }
//
//  def atJoseHome() = {
//    println("--- at Joe's home ---")
//
//    /** 将homeNetwork定义为def或者val都是一样的 */
//    implicit val homeNetwork: WiFI = new WiFI("home-network")
//
//    connectToNetwork("guest")(homeNetwork)
//    connectToNetwork("Joe Hacker")
//  }
//
//  def main(args: Array[String]): Unit = {
//    atOffice()
//    atJoseHome()
//  }
//}
