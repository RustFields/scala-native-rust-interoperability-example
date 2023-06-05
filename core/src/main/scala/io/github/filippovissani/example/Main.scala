package io.github.filippovissani.example

import io.github.filippovissani.example.Wrapper.repWithRust

object Main extends App {
  private val result = repWithRust(x => x + 1, 0)
  println(result)
}
