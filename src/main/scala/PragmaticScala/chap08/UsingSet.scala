package PragmaticScala.chap08

/**
 * @author zhangda
 * @date 2021/3/28 15:06
 * @note
 */

object UsingSet extends  App {
  val colors1 = Set("Bule", "Green", "Red")

  println(s"colors1 = ${colors1}")
  println(s"colors1.getClass = ${colors1.getClass}")
  // colors1.getClass = class scala.collection.immutable.Set$Set3

  val colors2 = colors1 + "Black"
  println(s"colors2 = ${colors2}")  // colors2为新生成的集合
  println(s"colors1 = ${colors1}") // colors1为不可变集合

  val feeds1 = Set("blog.toolshed.com", "pragdave.me", "blog.agiledeveloper.com")
  val feeds2 = Set("blog.toolshed.com", "martinfowler.com/bliki")

  println("-----------------------")
  val blogFeeds = feeds1.filter(_.contains("blog"))
  println(s"blog feeds: ${blogFeeds.mkString(", ")}")

  val mergedFeeds = feeds1 ++ feeds2
  println(s"# of merged feeds: ${mergedFeeds.size}")

  val commonFeeds = feeds1 & feeds2

  val urls = feeds1.map("https://" + _)
  println(s"one url: ${urls.head}")

}
