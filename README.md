# Bug in Dotty

This is a repository allowing to reproduce a bug in Dotty.

For some reason, the compiler introduces a `ClassCastException` in a lambda when it has trouble infering the correct type.

To reproduce, `sbt run`.
