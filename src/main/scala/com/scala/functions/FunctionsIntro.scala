package com.scala.functions

/*
    *Technically there are two types of sub routines based on the type of definition
    * IF it is defined using the keyword def then it is called Method
    * If it id defined using the keyword val then it is called function.
    * But most of the cases both method and function do the same thing and both are similar hence going further we will
    * be treating both of them as functions
    *
    *
*/
object FunctionsIntro extends App {
  //defining a function with return type
  //if a function has been defined with a return type then the last line of the body would be returned to the call.
  def favoriteCar(): String = {
    "Honda City"
  }

  val myFavoriteCar = favoriteCar()
  println(s"My favorite car is $myFavoriteCar")

  //defining a function with no paranthesis
  //like variables type inference concept can be used to functions aswell
  def secondFavoriteCar = "Hyundai Electra"

  println(s"My second favorite car is $secondFavoriteCar")

  //defining a function with no return type[defining with unit]
  def printPriceReport():Unit = {
    //lookup in some database and get the price report
    println("price report from the database.....")
  }
  printPriceReport()

}
