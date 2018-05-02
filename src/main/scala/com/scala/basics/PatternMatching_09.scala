package com.scala.basics

/*
  *
  * Pattern Matching is very much similar to the SWITCH case in java
  * In a layman term pattern matching is like a multiple choice question where we no for a given question there will
  * be one choice/option matching
 */

object PatternMatching_09 extends App {

  val riceType = "Brown"
  riceType match {
    case "Brown" => println("Good for health as it's form is complex")
    case "White" => println("Not so good as it's form is simple")
    case _ => println("Not sure what it is ")

      //a default type/choice/option which needs to be considered when it doesnt fall to the defined choices,
      //think of None of the Above option in multiple choice questions.
  }

  //even the output of a pattern matching can be stored in a variable.
  val riceResult=riceType match {
    case "Brown" => "Good for health as it's form is complex"
    case "White" => "Not so good as it's form is simple"
    case _ => "Not sure what it is "

    //a default type/choice/option which needs to be considered when it doesnt fall to the defined choices,
    //think of None of the Above option in multiple choice questions.
  }

  println(s"obtained riceResult is $riceResult")

  //pattern matching for two or more items on same condition
  val  car = "i20"
  val carMaker = car match{
    case "i10" | "i20" => "Hyundai"
    case "XUV500" => "Mahindra"
    case _ => "Others"
  }
  println(s"$car is from $carMaker")


}
