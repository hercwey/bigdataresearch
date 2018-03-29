package com.sharemeng.scala.oneday

/**
  * Scala函数： 用一例子来说明函数的定义和函数调用。
  */
object FunctionScala {
  def main(args: Array[String]): Unit = {
    println(addInt(1, 3)); //函数调用
  }

  def addInt(a: Int, b: Int): Int = { //函数定义
    var sum: Int = 0
    sum = a + b
    return sum
  }
}
