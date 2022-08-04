package com.pavelsvistetsky
package service

object SeqSumService {

  def sumOdd(lst: Seq[Int]): Int = {
    (lst filter { _ % 2 != 0 }).sum
  }
}
