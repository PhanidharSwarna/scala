package com.scala.basics

//About Variables
/*
  *Variables are nothing but logical containers which hold data, and this data can be referenced by the defined variable name.
  *There are 2 types of variables in scala
  *
  * 1) Mutable Variables-can be changed post definition--defined with the key word var
  *   Syntax: var <Name of our variable> : <Data type> = <Some literal>
  *   example: var authorName : String = "PhanidharSwarna"
  *
  * 2)Immutable Variables-cannot be changed once defined--defined with the key word val
  *   Syntax: val <Name of our variable> : <Data type> = <Some literal>
  *   example: val nameOfTheAUthor : String = "Dennis Ritche"

 */

//Lazy Initialization(delay the initialization)
/*
  * A simple difference between a variable and a lazy variable is that, a general variable gets assigned with the physical memory when it is defined
  * but a lazy variable gets its physical memory only if it has been referenced somewhere in the application.
  *
  * keyword lazy needs to be used to make a variable lazy.

 */

//Data Types
/*
  *In scala Data types are nothing but the predefined classes to represent the data, below are the possible types
  *
  * Double (4.9E-324 to 1.7976931348623157E308) [bounds inclusive]
  * Float (1.4E-45 to 3.4028235E38) [bounds inclusive]
  * Long (-9223372036854775808L to 9223372036854775807L)[bounds inclusive]
  * Int (-2147483648 to 2147483647)[bounds inclusive]
  * Short (-32768 to 32767)
  * Byte (-128 -- 127)
  * Char ()
  * Boolean (true, false)
  * String (any thing represented under double quotes)
  * Unit (represents nothing)

 */

//Declaring a variable with no Initial value.
/*
  *
  * As a fundamental rule that we know, any variable should be assigned with some initail value, what if we were not sure that what value
  * to be initialized first while defining , luckily we do had a solution
  * Use wild card character while defining a variable with no intial value
  * example:
  * var field: String = _
  * field = "initail value was assigned now"
 */

object Variables_DataTypes_01 {

  def main(args: Array[String]) = {
    //example implementation of mutable variable
    var authorName: String = "Phanidhar Swarna"
    println("Author name post first declarations of mutable variable is:" +authorName)
    authorName = "Dennis Ritche"
    println("Author name post second declarations of mutable variable is:" +authorName)

    //example implementation of immutable variable
    val nameOfTheAuthor: String = "Swarna"
    println("Author name post first declaration of immutable variable is " +nameOfTheAuthor)
    //nameOfTheAuthor = "Phanidhar"
    //The above statement is invalid and the IDE marks an error as "Re Assignment to val, in order to check the same, uncomment the above line"

    //lazy variable
    lazy val age: Int = 25

    val doubleExample: Double = 2.50
    val floatExample: Float = 2.50f
    val longExample: Long = 100000000L
    val intExample: Int = 4
    val shortExample: Short = 1
    val byteExample: Byte = 0xa
    val charExample: Char = 'S'
    val booleanExample: Boolean = 5>2
    val stringExample: String = "Your are awesome"
    val unitExample: Unit = ()

  }
}
