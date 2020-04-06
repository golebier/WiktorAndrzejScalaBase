package org.scala.grat.lesson.a

import org.junit.runner.RunWith
import org.scalatest.FunSpec
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class NameACTest extends FunSpec {

  it("Should object Paczek fields equals case class equal declaration!") {
    val name = Name("Wiktor", "Gole")
    assert(Paczek.name === name.name)
    assert(Paczek.surname === name.surname)
  }

  it("Should object Ziemniak fields equals case class equal declaration!") {
    val name = Name("Andrew", "Flak")
    assert(Ziemniak.name === name.name)
    assert(Ziemniak.surname === name.surname)
  }
}
