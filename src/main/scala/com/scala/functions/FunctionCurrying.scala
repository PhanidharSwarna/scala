package com.scala.functions

/*
    *Currying is nothing but breaking the function into number of small functions based on the params of the function
    * In mathematics
    * a general function would be f(x,y) = 2x+3y
    * calling this function would be f(3,4)
    * breaking this function call would result as f(3,4) = 2(3)+3(4)=6+12=18
    *
    * but a curried function would be like
    * f(x,y) = 2x +3y
    * calling this function would be as f(3,4) = 2(3) + 3y = g(y) [here g(y) is nothing but an another function]
    * then internal second call will be happen and results with 6+3(4)=6+12 = 18
    * Below examples would explain this better
    *
    * please note that partially applied functions are different from partial functions
*/

object FunctionCurrying extends App {

  def add(a: Int, b: Int, c: Int, d:Int): Int = {
    a+b+c+d
  }

  def addCurry(a:Int):Int=>Int=>Int=>Int={
    (b:Int) =>{
      (c:Int) =>{
        (d:Int) =>{
          a+b+c+d
        }
      }
    }
  }

  def addCurryFashion(a:Int)(b:Int)(c:Int)(d:Int)={
    a+b+c+d
  }

  println(add(1,2,3,4))
  println(addCurry(1)(2)(3)(4))
  println(addCurryFashion(1)(2)(3)(4))

}
