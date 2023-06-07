package io.github.filippovissani.example

import scala.scalanative.unsafe.extern

@extern
object Binding {
  def divide_wrapper(a: Int, b: Int): Int = extern
}
