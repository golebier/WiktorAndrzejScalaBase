package org.scala.grat

import org.junit.runner.RunWith
import org.scalatest.FunSpec
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class BaseACTest extends FunSpec {

  it("Should allocate the memory!") {
    val base = Base("Andrzej", "Flakiewicz")
    assert(base.name === "Andrzej")
    assert(base.surname === "Flakiewicz")
  }
}
