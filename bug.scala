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

    //Error: this will throw a NullPointerException
    val anotherObject: MyClass = null
    anotherObject.printName()
  }
}
```