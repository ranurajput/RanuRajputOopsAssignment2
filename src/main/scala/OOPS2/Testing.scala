package OOPS2

object Testing {
  def main(args: Array[String]): Unit = {
    println("OOPS assignment 2 done by Ranu Rajput")
    var personOne = new Person("Test", 24)
    var personTwo = new Person("Test", 25)
    //var personOne =new Person( name="TestAgain", age=24)
    //var personTwo=new Person(name="Test",age=25) // Output: False..
    personOne.check(personTwo)
  }
}
