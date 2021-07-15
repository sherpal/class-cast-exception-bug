package example

import example.Foo.MakeBar

trait Foo[+A]:
  def run(): A

  def bar[B <: Bar](stuff: String): Foo[B] = 
    Foo.MakeBar[B](stuff)

  def map[B](f: A => B): Foo[B] =
    Foo.Map(this, f)
end Foo

object Foo:
  case class MakeBar[A <: Bar](stuff: String) extends Foo[A]:
    def run(): A = Bar.bar

  case class Map[A, B](foo: Foo[A], f: A => B) extends Foo[B]:
    def run(): B = f(foo.run())

  object UnitFoo extends Foo[Unit]:
    def run(): Unit = ()
end Foo
