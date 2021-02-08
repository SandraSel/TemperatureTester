import scala.io.StdIn.readLine

object TemperatureTester extends App {
  println("This program is going to help you check your temperature!")
  val yourTemp = readLine ("What is your current temperature?").toInt
  if (yourTemp > 37) {
    println("You have a HIGH temperature!")
  } else if (yourTemp <= 35) {
    println("Your temperature is LOW!")
  } else {
    println("You have a normal temperature!")
  }
}

//TO do write a program which asks for user's temperature
//if Temperature is over 37C print a warming about high temperature
//if temperature is under 35 print a warning about being cold
//otherwise print that everything is great :0
