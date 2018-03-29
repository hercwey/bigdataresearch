package com.sharemeng.scala.oneday

/**
  * Scala闭包：
  * 闭包是一个函数，返回值依赖于声明在函数外部的一个或多个变量
  */
object ClosureScala {
  def main(args: Array[String]): Unit = {
    println("muliplier(1) value = " + muliplier(1))
    println("muliplier(2) value = " + muliplier(2))
  }

  var factor = 3 //定义在函数外部的自由变量
  val muliplier = (i: Int) => i * factor //muliplier 函数变量就是一个闭包
}
