package example

trait Bar

object Bar:
  def bar[A <: Bar]: A = (new Bar {}).asInstanceOf[A]
end Bar
