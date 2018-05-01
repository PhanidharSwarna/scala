package com.scala.basics

object ForComprehension_06 extends App{

  //a simple for loop
  for(i <- 1 to 5){
    println(s"This is the $i iteration")
  }

  //filter within for loop
  val xs = List("oats","nuts","protein","fats","sugar","complex carbs","simple carbs")
  for (x <- xs if x == "sugar"){
    println(s"$x should be eliminated to get slim and trim")
  }

  //use of yeild keyword
  val result = for {

    x <- xs
    if x == "sugar" || x == "simple carbs"
  }yield x
  println(result)

}
