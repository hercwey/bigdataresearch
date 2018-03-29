package com.sharemeng.scala.oneday

import java.io.PrintWriter

class QuickStart {

}

/**
  * 类和对象：
  * 类是抽象的，不占用内存；对象是类的具体实例，占用存储空间。
  */

//import java.io._

class Point(xc: Int, yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int): Unit = {
    x = x + dx
    y = y + dy
    println("x的坐标：" + x)
    println("y的坐标：" + y)
  }

  var name = ""

  override def toString = getClass.getName + "[name=" + name + "]"
}

object TestObj {
  def main(args: Array[String]): Unit = {
    val pt = new Point(10, 20)
    // 移动一个新的位置
    pt.move(10, 10)
  }
}

/**
  * 继承，和java差不多
  *
  * @param xc
  * @param yc
  * @param zc
  */
class Location(val xc: Int, val yc: Int,
               val zc: Int) extends Point(xc, yc) { // 继承重写了父类的字段
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println("x点的坐标是：" + x)
    println("y点的坐标是：" + y)
    println("z点的坐标是：" + z)
  }

  var salary = 0.0

  override def toString = super.toString + "[salary=" + salary + "]"
}

object testExtend {
  def main(args: Array[String]): Unit = {
    val loc = new Location(10, 20, 30)
    loc.move(10, 10, 5)
    loc.name = "lc"
    loc.salary = 35000.0
    println(loc)
  }
}

/**
  * 文件I/O
  */

import java.io._

object TestFileIO {
  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter(new File("D:\\test.txt"))
    writer.write("scala语言")
    writer.close()
  }
}

/**
  * 从屏幕读取用户输入
  */
import java.io._
object TestInput {
  def main(args: Array[String]): Unit = {
    print("What is your name? __")
    val br = new BufferedReader(new InputStreamReader(System.in))
    val line = br.readLine
    println("Welcome, "+ line)
  }
}
