package io.github.filippovissani.example

import io.github.filippovissani.example.TypeBinding.{CFunIntToInt, CInt}

import scala.scalanative.unsafe
import scala.scalanative.unsafe.extern

object TypeBinding:
  type CInt = unsafe.CInt
  type CFunIntToInt = unsafe.CFuncPtr1[CInt, CInt]

@extern
object Binding:
  def divide(a: CInt, b: CInt): CInt = extern

  def generic_operation(x: CInt, f: CFunIntToInt): CInt = extern
