package hello

object World extends App {
  println ("Hello, World!")
  println(addNumbers(1, 3))

  def addNumbers(a: Int, b: Int) = {
    a + b
  }
}


