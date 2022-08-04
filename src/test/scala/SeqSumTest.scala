package com.pavelsvistetsky

import service.SeqSumService

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class SeqSumTest extends AnyFlatSpec with Matchers {

  "SeqSumService.sumOdd(Seq[Int])" should "return sum of all odd numbers" in {

    val lst: Seq[Int] = List(0, 1, 1, 2, 3, 5)

    assertResult(10) {
      SeqSumService.sumOdd(lst)
    }
  }
}
