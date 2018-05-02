package com.scala.functions

/*
    *This is similar to the typed functions
    * the difference is that typed functions has param types as generic where as poly function has both return type and
    * param type as optional
*/
object PolymorphicFunction extends App {
  def dailyDiscount[T](discount: T): T = {
    discount match {
      case t: Int => {
        println("This is an Integer type")
        discount
      }
      case t: Double => {
        println("This is a Double type")
        discount
      }
    }
  }
  dailyDiscount[Int](5)
  dailyDiscount[Double](10.5)

}
