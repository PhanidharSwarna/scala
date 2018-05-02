package com.scala.functions

/*
    *Typed functions allow you to define functions with generic params
    * while calling a typed function you have to specify the type
*/
object TypedFunctions extends App {

  def dailyDiscount[T](discount: T) ={
    discount match{
      case t: Int => println("Supplied param is Int type")
      case t: Double => println("Supplied param is Double type")
    }

  }
  dailyDiscount[Int](5)
  dailyDiscount[Double](10.5)


}
