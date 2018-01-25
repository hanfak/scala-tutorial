package com.hanfak.essentialscala.collections.squeneces

object Exercise02 extends App {

  case class Film(name: String, yearOfRelease: Int, imdbRating: Double)

  case class Director(firstName: String, lastName: String, yearOfBirth: Int, films: Seq[Film])

  val memento = new Film("Memento", 2000, 8.5)
  val darkKnight = new Film("Dark Knight", 2008, 9.0)
  val inception = new Film("Inception", 2010, 8.8)
  val highPlainsDrifter = new Film("High Plains Drifter", 1973, 7.7)
  val outlawJoseyWales = new Film("The Outlaw Josey Wales", 1976, 7.9)
  val unforgiven = new Film("Unforgiven", 1992, 8.3)
  val granTorino = new Film("Gran Torino", 2008, 8.2)
  val invictus = new Film("Invictus", 2009, 7.4)
  val predator = new Film("Predator", 1987, 7.9)
  val dieHard = new Film("Die Hard", 1988, 8.3)
  val huntForRedOctober = new Film("The Hunt for Red October", 1990, 7.6)
  val thomasCrownAffair = new Film("The Thomas Crown Affair", 1999, 6.8)

  val eastwood = new Director("Clint", "Eastwood", 1930, Seq(highPlainsDrifter, outlawJoseyWales, unforgiven, granTorino, invictus))
  val mcTiernan = new Director("John", "McTiernan", 1951, Seq(predator, dieHard, huntForRedOctober, thomasCrownAffair))
  val nolan = new Director("Christopher", "Nolan", 1970, Seq(memento, darkKnight, inception))
  val someGuy = new Director("Just", "Some Guy", 1990, Seq())
  val directors = Seq(eastwood, nolan, someGuy, mcTiernan)


  def directorWithFilmsMoreThan(numberOfFilms: Int): Seq[Director] = {
    directors.filter(x => x.films.length > numberOfFilms)
  }

  def directorWithFilmsMoreThanV1(numberOfFilms: Int): Seq[String] = {
    directors.filter(x => x.films.length > numberOfFilms).map(x => x.lastName)
  }

  def directorWithFilmsMoreThanV2(numberOfFilms: Int): Seq[String] = {
    directors.filter(_.films.length > numberOfFilms).map(_.lastName)
  }

  println(s"${directorWithFilmsMoreThan(2)}")
  println(s"${directorWithFilmsMoreThan(3)}")
  println(s"${directorWithFilmsMoreThan(4)}")
  println(s"${directorWithFilmsMoreThanV2(2)}")
  println(s"${directorWithFilmsMoreThanV2(3)}")
  println(s"${directorWithFilmsMoreThanV2(4)}")

  def directorBornBeforeWithFilmsMoreThan(numberOfFilms: Int, year: Int): Seq[Director] = {
    directors.filter(_.yearOfBirth < year).filter(_.films.length > numberOfFilms)
  }

  println()
  println(s"${directorBornBeforeWithFilmsMoreThan(2, 1940)}")
  println(s"${directorBornBeforeWithFilmsMoreThan(2, 1930)}")
  println()
  println(s"${directorBornBeforeWithFilmsMoreThan(2, 1960)}")
  println(s"${directorBornBeforeWithFilmsMoreThan(2, 1940)}")


  def orderDirectorsByAge(ascending: Boolean = true): Seq[Director] = {
    directors.sortWith { (director1, director2) =>
      if (ascending) {
        director1.yearOfBirth < director2.yearOfBirth
      } else {
         director1.yearOfBirth >= director2.yearOfBirth
      }
    }
  }
  println
  println(s"${orderDirectorsByAge().map(_.lastName)}")

}
