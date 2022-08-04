package com.pavelsvistetsky

import model.KindHolder.parse
import model.{IntKindHolder, KindHolder}

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class KindHolderTest extends AnyFlatSpec with Matchers {

  private val ID = 1
  private val DESCRIPTION = "description"

  "KindHolder[Int]" should "return \"неизвестно\" on empty kind" in {

    val kindHolder: KindHolder[Int] = IntKindHolder(ID, DESCRIPTION, Option.empty)

    assertResult("неизвестно") {
      parse(kindHolder)
    }
  }

  it should "return \"чётное\" on even kind" in {

    val kindHolder = IntKindHolder(ID, DESCRIPTION, Option(2))

    assertResult("чётное") {
      parse(kindHolder)
    }
  }

  it should "return it's description on odd kind" in {

    val kindHolder = IntKindHolder(ID, DESCRIPTION, Option(3))

    assertResult(DESCRIPTION) {
      parse(kindHolder)
    }
  }
}
