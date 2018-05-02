package com.scala.functions

/*
    *please note the difference for the below code with FunctionWIthParams code
    * implicit params should be defined last
    * scala compliler will look for the implicit params defined in scope with the type not with the name
*/
object FunctionWithImplicitParams extends App {

  def icecreamCost(name: String, quantity: Int)(implicit discount: Int):Int={
    30*quantity-discount
  }
  implicit val clearanceDiscount = 50
  println(s"clearence sale started and hence each customer will receive a discount of $clearanceDiscount")
  println(icecreamCost("Strawberry",5))
  //implicit param can also be passed manually
  println(icecreamCost("strawberry",5)(100))

}
