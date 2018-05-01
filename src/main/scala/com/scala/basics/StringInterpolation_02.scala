package com.scala.basics

/*
  *
  * Interpolation meaning as per google ::: the insertion of something of a different nature into something else.
  * If a variable is inserted inside a string then it is called string interpolation(s Interpolation)
  * s,$ are used to represent a variable  inside a string.(s Interpolation)
  *
  * Expressions can also be evaluated using {}
  *
  * Using String Interplation for formatiing text :: in some cases, you may want to format your strings by say pre-pending some white spaces in front of the text.
   * This can be achieved using the f interpolation
   * f Interpolation can be used to format numbers.
   *
   * raw intrplation, this can be used to insert some predefined symbols as it is , instead of the defined backend definition.
 */

object StringInterpolation_02 extends App {
  val MY_VAR: Int = 20
  println(s"The Value of MY_VAR is $MY_VAR")

  println(s"MY_VAR is a positive number? :: ${MY_VAR > 0}")

  val MY_STRING: String = "Hello World!"
  println(f"The value of MY_STRING is $MY_STRING%20s")

  val MY_NUMBER = 2.52340
  //Now note the difference betweeen the s interpolation and f interpolation for type number
  println(s"Value of MY_NUMBER when using s interpolation is $MY_NUMBER")
  println(f"Value of MY_NUBMER when using f interpolation is $MY_NUMBER%.2f")

  println("I just love to drink \t coconut water")
  println(raw"I just love to drink \t coconut water")

}
