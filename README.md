# NullPointerException in Scala

This repository demonstrates a common error in Scala programming: the `NullPointerException`.  This occurs when you attempt to access a member of an object that's currently null.

## Bug Description:
The `bug.scala` file contains a simple class `MyClass` and a `Main` object. The `main` function demonstrates the problem: calling a method on a null reference. This will lead to a `NullPointerException` at runtime.

## Solution:
The solution is to ensure that the object reference isn't null before accessing its members. The `bugSolution.scala` shows how to resolve this by adding null checks using `if` statements or the `Option` type.