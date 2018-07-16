package division1

/*
  *
  * AS a basic understanding we know that characters can be escaped using back slash,
  * but what if it has to be used multiple times, for example consider a json file
 */

object EscapeCharacters_03 extends App {

  //val donutJson: String ="{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"
  //The Scala compiler will complain about the double quotes in the JSON field names.

  val donutJson2: String ="{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
  //This works but looks ugly, since back slash needs to be used for every double quote in JSON
  println(donutJson2)

  //using triple quotes """ to escape characters
  val donutJson3: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
  println(donutJson3)

  //Creating multi-line text using stripMargin

  // What if you would like to indent your text so that it's more readable?
  // Look no further,Scala is here to help with the use of stripMargin:

  val donutJson4: String =
    """
      |{
      |"donut_name":"Glazed Donut",
      |"taste_level":"Very Tasty",
      |"price":2.50
      |}
    """
      .stripMargin

  //stripMargin can even take parameters where as the default parm is |
  println(donutJson4)

  val donutJson5: String =
    """
      #{
      #"donut_name":"Glazed Donut",
      #"taste_level":"Very Tasty",
      #"price":2.50
      #}
    """
      .stripMargin('#')

  println(donutJson5  )

}
