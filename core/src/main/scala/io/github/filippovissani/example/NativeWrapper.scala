package io.github.filippovissani.example

import io.github.filippovissani.example.Native.rep

import scala.scalanative.unsafe.{CFuncPtr1, extern, link}

@link("native_library.so")
@extern
object Native {
  def rep(func: CFuncPtr1[Int, Int], input: Int): Int = extern
}

object Wrapper {
  def repWithRust(func: Int => Int, input: Int): Int = {
    val rustFunction: CFuncPtr1[Int, Int] = func
    rep(rustFunction, input)
  }
}
