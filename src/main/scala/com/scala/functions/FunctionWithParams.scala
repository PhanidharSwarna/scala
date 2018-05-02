package com.scala.functions

/*
    *In this section we will see how to define functions that take inputs[params]
*/
object FunctionWithParams extends App {

  def calculateIceCreamCost(name: String, quantity: Int): Int = {
    //some calculation by getting the cost related to name from database
    30 * quantity
  }

  println(s"cost of straberry icecream for 5 quantity is ${calculateIceCreamCost("strawberry",5)} ")

  //next defining input parms that accept default values
  //for example in this sale we have distributed few discount coupons for some reliable customers, in this case we need
  //minus the discount coupon for few customers and few it should not be the case

  def calculateIceCreamCostDiscountMela(name: String, quantity: Int, discount: Int = 0): Int ={

    //some calculation by getting the cost realted to name from database
    30*quantity-discount

  }
  val withDiscount = calculateIceCreamCostDiscountMela("strawberry", 5, 50)
  val withOutDiscount = calculateIceCreamCostDiscountMela("strawberry",5)

  println(s"customer who has discount coupon ${withDiscount}")
  println(s"customer who donot had discount coupon $withOutDiscount")

}
