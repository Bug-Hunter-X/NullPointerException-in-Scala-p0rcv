```scala
class MyClass(val name: String) {
  def printName(): Unit = {
    println(name)
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val myObject = new MyClass("Scala")
    myObject.printName()

    // Solution 1: Using an if statement for null check
    val anotherObject: MyClass = null
    if (anotherObject != null) {
      anotherObject.printName()
    } else {
      println("anotherObject is null")
    }

    // Solution 2: Using Option for null handling
    val maybeObject: Option[MyClass] = Option(null)
    maybeObject.foreach(_.printName())
    maybeObject.getOrElse(new MyClass("Default")).printName()
  }
}
```