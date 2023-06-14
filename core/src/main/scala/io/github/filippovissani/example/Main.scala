package io.github.filippovissani.example

import io.github.filippovissani.example.Binding.{divide, generic_operation}
import io.github.filippovissani.example.TypeBinding.{CFunIntToInt, CInt}
import scala.scalanative.unsafe

object Main extends App:
  private val myLambdaFuncPtr: CFunIntToInt = (x: CInt) => x + 1
  private val divideResult = divide(20, 2)
  private val genericOperationResult = generic_operation(43, myLambdaFuncPtr)
  println(divideResult)
  println(genericOperationResult)
