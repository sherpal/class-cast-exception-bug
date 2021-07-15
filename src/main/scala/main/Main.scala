package main

import example._

object Main {
  def main(args: Array[String]): Unit = {
    val theFirstWorkingInstance = Foo.UnitFoo.bar("hello").map((_: Any) => 2)
    val theSecondWorkingInstance = Foo.UnitFoo.bar("hello").map((_: Bar) => 2)
    val theCrashingInstance = Foo.UnitFoo.bar("hello").map(_ => 2)

    println("This will work:")
    println(theFirstWorkingInstance.run())
    println(theSecondWorkingInstance.run())

    println("This will crash:")
    println(theCrashingInstance.run())
  }
}
