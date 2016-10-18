package main.scala.entity

/**
  * Created by 7 on 2016/10/18.
  */
class Counterx {
  private var value = 0;

  def increment() {
    value += 1
  }

  def current() = value
}
