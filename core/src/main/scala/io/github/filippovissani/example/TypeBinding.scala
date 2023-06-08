package io.github.filippovissani.example

import scala.scalanative.unsafe

object TypeBinding {
  type cInt = unsafe.CInt
  type cFunIntToInt = unsafe.CFuncPtr1[cInt, cInt]
}
