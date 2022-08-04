package com.pavelsvistetsky
package model

sealed trait KindHolder[+T] {
  def kind: Option[T]
}

case class IntKindHolder[T <: Int](id: Int, description: String, kind: Option[T]) extends KindHolder[T] {
}

object KindHolder {
  def parse[T <: Int](kindHolder: KindHolder[T]): String = {
    kindHolder match {
      case IntKindHolder(_, _, None) => "неизвестно"
      case IntKindHolder(_, _, Some(x)) if x % 2 == 0 => "чётное"
      case IntKindHolder(_, description, Some(x)) if x % 2 != 0 => s"$description"
    }
  }
}
