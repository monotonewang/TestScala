package main.scala

/**
  * Created by 7 on 2016/10/18.
  */
object TestScala {

  def main(args: Array[String]) {
    println("max====" + max(3, 7))
    println("Hello World")
  }

  def max(x: Int, y: Int): Int = {
    if (x > y) {
      x
    }
    else {
      y
    }
  }
}

