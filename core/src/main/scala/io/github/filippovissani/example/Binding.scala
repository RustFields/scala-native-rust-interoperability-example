package io.github.filippovissani.example


import io.github.filippovissani.example.TypeBinding.{cFunIntToInt, cInt}

import scala.scalanative.unsafe
import scala.scalanative.unsafe.extern

@extern
object Binding {
  def divide(a: cInt, b: cInt): cInt = extern

  def generic_operation(x: cInt, f: cFunIntToInt): cInt = extern
}
