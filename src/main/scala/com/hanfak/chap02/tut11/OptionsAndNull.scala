package com.hanfak.chap02.tut11

object OptionsAndNull extends App {

  // Avoid nullpointerexception, similar to optional in java
  // Avoids side effects

  val someOptionalString: Option[String] = Some("Some random words")

  // calling get is a code smell, as could lead to null
  println(s"to get the word from the option: ${someOptionalString.get}")

  val someOtherOptional: Option[String] = None // if you know that the value is absent
  println(s"to get the word from the option: ${someOtherOptional.getOrElse("Other words")}")
  //  println(s"to get the word from the option: ${someOtherOptional.get}") // get exception

  println("\n\nUse of pattern matching with options")
  someOtherOptional match {
    case Some(name) => println(s"Received name = $name")
    case None => println(s"No name was found!")
  }

  println("\n\nAnother example")
  case class User(
                   id: Int,
                   firstName: String,
                   lastName: String,
                   age: Int,
                   gender: Option[String])

  val users = Map(1 -> User(1, "John", "Doe", 32, Some("male")),
    2 -> User(2, "Johanna", "Doe", 30, None))
  def findById(id: Int): Option[User] = users.get(id) // How to define a function
  def findAll = users.values
  // Change argument
  val user1 = findById(4) // if id exist, then can use get, if not then if is false
  if (user1.isDefined) {
    println(user1.get.firstName)
  }
  // better version than using if
  println(user1.getOrElse("No user by that id"))

  val user = User(2, "Johanna", "Doe", 30, None)
  println("Gender: " + user.gender.getOrElse("not specified"))


  //using pattern matching - avoid as verbose
  val gender = user.gender match {
    case Some(gender) => gender
    case None => "not specified"
  }
  println("Gender: " + gender)
//Option can be treated as a collection and provides map, flatMap, filter and other methods you know from collections,
  findById(1).foreach(user => println(user.firstName)) //handles options

  val age = findById(1).map(_.age)
  println(age)
  val genderByMap = findById(1).map(_.gender)
  println(genderByMap)

  val genderByFlatMap = findById(1).flatMap(_.gender)
  println(genderByFlatMap)

  val userFilteredByAge = findById(1).filter(_.age > 30)
  println(userFilteredByAge)
  val userFilteredByAge1 = findById(1).filter(_.age < 30)
  println(userFilteredByAge1)


  //If the UserRepository already returns None or the Gender is None,
  // the result of the for comprehension is None.
  // For the user in the example, a gender is defined, so it is returned in a Some.

  val genderOfUserByForComprehension = for {
    user <- findById(1)
    gender <- user.gender
  } yield gender
  println(genderOfUserByForComprehension)

  val firstNameOfUserByForComprehension1 = for {
    user <- findAll
    firstName <- user.firstName
  } yield firstName
  println(firstNameOfUserByForComprehension1)
}
