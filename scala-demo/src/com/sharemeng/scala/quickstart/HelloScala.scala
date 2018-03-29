package com.sharemeng.scala.oneday


/**
  * 第一个Scala程序
  * Scala和Java最大的区别是：Scala语句末尾的分号（；）是可选的！
  * 编译运行：
  * 先编译：scalac HelloScala.scala   将会生成两个文件：HelloScala$.class和HelloScala.class
  * 在运行：scala HelloScala
  * 输出结果：hello scala!!!
  */
object HelloScala {
  def main(args: Array[String]): Unit = {
    println("hello scala!!!")

    //多行字符串定义方式
    val multilineStr =
      """你今天
        感觉
      怎么样？"""
    println(multilineStr)

    // 常量
    val xmax, ymax = 100

    //变量
    var zmax:Int = 50
    zmax = 30
    print(xmax + ymax + zmax)


  }
}

