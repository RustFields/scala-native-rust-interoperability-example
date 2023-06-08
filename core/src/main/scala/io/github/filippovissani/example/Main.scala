package io.github.filippovissani.example

import Binding.*
import io.github.filippovissani.example.TypeBinding.{cFunIntToInt, cInt}

import scala.scalanative.unsafe

object Main extends App {
  private val myLambdaFuncPtr: cFunIntToInt = (x: cInt) => x + 1
  private var result = divide(20, 2)
  println(result)
  result = generic_operation(665, myLambdaFuncPtr)
  println(result)
}
