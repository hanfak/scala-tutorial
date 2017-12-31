package com.hanfak.chap02.tut03

object StringEscaped extends App {
  val donutJson2: String ="{\"donut_name\":\"Glazed Donut\",\"taste_level\":\"Very Tasty\",\"price\":2.50}"
  println(s"donutJson2 = $donutJson2")

  println("\nStep 3: Using triple quotes \"\"\" to escape characters")
  val donutJson3: String = """{"donut_name":"Glazed Donut","taste_level":"Very Tasty","price":2.50}"""
  println(s"donutJson3 = $donutJson3")

  val donutJson4: String =
    """ Remove pipe (default)
      |{
      |"donut_name":"Glazed Donut",
      |"taste_level":"Very Tasty",
      |"price":2.50
      |}
    """
      .stripMargin

  println(s"donutJson4 = $donutJson4")

  val donutJson5: String =
    """ Remove #
#{
#"donut_name":"Glazed Donut",
#"taste_level":"Very Tasty",
#"price":2.50
#}
""" .stripMargin('#')
  println(s"donutJson5 = $donutJson5")
}


