package io.github.filippovissani.example

import io.github.filippovissani.example.Binding.{divide, generic_operation}
import io.github.filippovissani.example.TypeBinding.{CFunIntToInt, CInt}
import scala.scalanative.unsafe

object Main extends App:
  private val myLambdaFuncPtr: CFunIntToInt = (x: CInt) => x + 1
  private var result = divide(20, 2)
  println(result)
  result = generic_operation(665, myLambdaFuncPtr)
  println(result)