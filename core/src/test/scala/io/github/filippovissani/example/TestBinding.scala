package io.github.filippovissani.example

import io.github.filippovissani.example.Binding.{divide, generic_operation}
import io.github.filippovissani.example.Main.myLambdaFuncPtr
import io.github.filippovissani.example.TypeBinding.{CFunIntToInt, CInt}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers.shouldBe

class TestBinding extends AnyFunSuite:

  test("20 / 2 should be 10") {
    divide(20, 2) shouldBe 10
  }

  test("43 + 1 should be 44") {
    val myLambdaFuncPtr: CFunIntToInt = (x: CInt) => x + 1
    generic_operation(43, myLambdaFuncPtr) shouldBe 44
  }
