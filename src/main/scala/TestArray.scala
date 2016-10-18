package main.scala

import scala.collection.mutable.ArrayBuffer

/**
  * Created by 7 on 2016/10/18.
  */
object TestArray {
  def main(args: Array[String]): Unit = {
    printArray();
    println(sumArray())
    arrayBuffer()
  }

  /**
    * 打印数组
    */
  def printArray(): Unit = {
    val a = new Array[String](3)
    a(0) = "xxxxx"
    a(1) = "yyyyy"
    a(2) = "zzzzz"
    for (x <- a) {
      println(x)
    }
    println(  "apply="+a.apply(2))
  }

  /**
    * 求数组里面的值
    * @return
    */
  def sumArray(): Int = {
    val a = Array(12, 43, 212, 12)
    var sum = 0
    for (i <- 0 until a.length) {
      sum += a(i)
    }
    sum
  }

  def arrayBuffer(): Unit ={
    val b =ArrayBuffer[Int]()
    b+=1
    b+=(1,2,3,5)
    b++=Array(3,21,211)
    for(x<- b){
      print("---"+x)
    }
  }
}
