package io.github.filippovissani.example

import scala.scalanative.unsafe.Zone

object Main extends App {
  private val result = Binding.divide(20, 2)
  println(result)
}
