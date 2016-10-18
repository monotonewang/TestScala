package main.scala.entity

/**
  * Created by 7 on 2016/10/18.
  */
object TestObject {
  def main(args:Array[String]): Unit ={
    val myCounter=new Counterx
    myCounter.increment()
    print(myCounter.current())
  }
}
