package main.scala

/**
  * Created by 7 on 2016/10/18.
  */
object TestNine {

  def main(args: Array[String]) {

//    nine(100)
    println(getNum(1, 6))
    ventor();
  }

  /**
    * 二元运算
    * @param x
    * @param y
    * @return
    */
  def getNum(x: Int, y: Int): Int = {
    val s = if (x > y) 0 else 1
    s
  }

  /**
    * 九九乘法表
    * @param n
    */
  def nine(n: Int): Unit = {
    for (i <- 1 to 9; j <- 1 to 9;if i!=j) {
      if (j == 9) {
        println(i * j + "--")
      } else {
        print(i * j + "--")
      }
    }
  }

  /**
    * ventor
    */
  def ventor(): Unit ={
    val a=for(i<- 1 to 10) yield i%3
    println(a)
  }
}
