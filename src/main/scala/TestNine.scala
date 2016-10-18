package main.scala

/**
  * Created by 7 on 2016/10/18.
  */
object TestNine {

  def main(args: Array[String]) {

  nine(100)
  }

  def nine(n:Int): Unit ={
    for(i<-1 to 9; j<-1 to 9){
      if(j==9){
        println(i*j+"--")
      }else{
        print(i*j+"--")
      }
    }
  }
}
