package com.scala.basics

/*
  *
  * In scala If Else can be used as a statement and a expressionn.
  * something that evaluates to a result is called an expression
 */

object IfElse_05 extends App{

  //using if and else as a statement
  val age = 20
  if (age >= 18){
    println(s"You are elgible to elect your representative as your age is $age which is greater than 18")
  }
  else {
    println("Minimum age to elect a person as a representative is 18")
  }
  //using if and else as an expression
  val eligiblity = if(age > 18) true else false
  println(eligiblity)

}
