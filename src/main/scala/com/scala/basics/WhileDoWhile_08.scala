package com.scala.basics

object WhileDoWhile_08 extends App{

  var iterations = 10
  while (iterations >0){
    println(s"Value of iteration is $iterations")
    iterations -= 1
  }

  do{
    println("This will be executed atleast once")
    println("do will be executed and then while loop will be executed")
  }while (iterations > 0)

  /*
    *
    * please do note that iterations value has been reduced to 0 before being called in the second while
    * but since it is a do while loop, do body will be executed first only then it will realise that while condition
    * has been evaluated to false and the loop gets exited.
   */


}
