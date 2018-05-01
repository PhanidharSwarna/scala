package com.scala.basics

object Range_07 extends App {

  //creating a simple numeric range from 1 to 5 both bounds are inclusive
  val from1to5 = 1 to 5
  println(s"Range from 1 to 5 inclusive = ${from1to5}")

  //creating a simple numberic range from 1 till 5, which means upper bound not included
  val from1till5 = 1 until 5
  println(s"Range from 1 till 5 = $from1till5")

  //creating a numeric range from 1 to 10 with an increment of 2

  val from1to10by2 = 1 to 10 by 2
  println(from1to10by2)

}
