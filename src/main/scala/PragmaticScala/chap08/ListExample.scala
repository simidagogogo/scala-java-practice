package PragmaticScala.chap08

/**
 * @author zhangda
 * @date 2021/3/28 15:55
 * @note
 */
object ListExample extends  App {

  val girls = List("lianmeng", "luyue", "zhangyue", "duiqi")
  println(girls.apply(0))
  println(girls(0))
  println(girls.head)

  // 前插元素
  val new_girls = "sunny" :: girls
  println(new_girls)

  val star = List("zhangbozhi", "tingfeng")

  // 前插列表
  val merge = star ::: girls
  println(merge)


  girls.filter(_.contains("yue")).mkString(", ")
  girls.forall(_.contains("yue"))
  girls.exists(_.contains("yue"))
  
  val total = star.foldLeft(0){(total, name) => total + name.length}
  println(s"total = ${total}")
}
