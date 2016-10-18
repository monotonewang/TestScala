package main.scala

/**
  * Created by 7 on 2016/10/18.
  */
object TestScala {

  def main(args: Array[String]) {
    println("max====" + max(3, 7))
    println(num(100));
    println(num2(100));
  }

  def max(x: Int, y: Int): Int = {
    if (x > y) {
      x
    }
    else {
      y
    }
  }

  /**
    * 1+99
    * @param n
    * @return
    */
  def num(n:Int): Int ={
    var sum =0;
    for(i <-1 until n){
      sum=sum+i;
    }
    return sum;
  }

  /**
    * 1+100
    * @param n
    * @return
    */
  def num2(n:Int): Int ={
    var sum =0;
    for(i <-1 to n){
      sum=sum+i;
    }
    return sum;
  }
}

