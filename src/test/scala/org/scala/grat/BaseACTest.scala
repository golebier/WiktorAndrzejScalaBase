package org.scala.grat

import org.junit.runner.RunWith
import org.scalatest.FunSpec
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class BaseACTest extends FunSpec {

  it("Should allocate the memory!") {
    val base = Base("wiktor", "golebiewski")
    assert(base.name === "wiktor")
    assert(base.surname === "golebiewski")
  }
}
