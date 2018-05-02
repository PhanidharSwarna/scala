package com.scala.functions

/*
    *variable argument function indicates that multiple arguments can be passed of same type
*/
object VariableArgumentFunction extends App {

  def variableParams(name: String*)={
    println(name.mkString(","))
  }
  variableParams("Phanidhar","swarna")
  variableParams("Dennis")

}
