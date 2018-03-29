package com.sharemeng.scala.oneday

/**
  * Scala字符串：Scala中可以创建两种字符串：一种是不可修改的，一种是可以修改的。
  */

// 创建不可修改的字符串
//var greeting:String = "Hello World!"

// 创建可以修改的字符串
object StringScala {
  def main(args: Array[String]): Unit = {
    val buf = new StringBuilder
    buf += 'a' // 添加一个字符
    buf ++= "bcdef" // 添加一个字符串
    println(buf.toString())
  }
}

object Test {
  def main(args: Array[String]): Unit = {
    var str1 = "字符串1："
    var str2 = "字符串2"
    var str3 = "字符串3："
    var str4 = "字符串4"
    println(str1 + str2)
    println(str3.concat(str4))
    println(str1.length)
  }
}

/**
  * 创建格式字符串
  */
object TestStr {
  def main(args: Array[String]): Unit = {
    var floatVar = 12.456
    var intVar = 2000
    var stringVar = "字符串变量"
    var fs = printf("浮点型变量为 %f, 整形变量为 %d, 字符串为 %s", floatVar, intVar, stringVar)
    println(fs)
  }
}

/**
  * Scala数组
  */
object TestArray {
  def main(args: Array[String]): Unit = {
    var myList = Array(1.1, 2.2, 3, 3, 4)

    //输出所有数组元素
    for (x <- myList) {
      println(x)
    }

    // 计算数组所有元素的总和
    var total = 0.0
    for (i <- 0 to (myList.length - 1)) {
      total += myList(i)
    }
    println("总和：" + total)

    // 查找数组中的最大元素
    var max = myList(0)
    for (i <- 1 to (myList.length - 1)) {
      if (myList(i) > max) {
        max = myList(i)
      }
    }
    println("最大值： " + max)
  }
}


/**
  * Scala集合：分为可变集合和不可变集合。
  * 可变集合：可以在适当的地方被更新或扩展，也就是可以修改、添加、移除一个集合的元素。
  * 不可变集合：永远不会改变。但可以模拟添加、移除、更新操作，但是这些操作将在每一种情况下都返回一个新的集合，
  *            同时使原来的集合不发生改变。
  * // 定义整形List
  * val x = List(1,2,3,4)
  * // 定义Set
  * var x = Set(1,3,5,7)
  * // 定义Map
  * val x = Map("one" -> 1, "two" -> 2, "three" -> 3)
  * // 创建两个不同类型的元组
  * val x = (10, "Runoob")
  * // 定义Option
  * val x:Option[Int] = Some(5)
  */

/**
  * Scala迭代器
  */
object TestIterator {
  def main(args: Array[String]): Unit = {
    val it = Iterator("one", "two", "three", "four")
    while(it.hasNext) {
      println(it.next()) //返回迭代器的下一个元素，并更新迭代器的状态
    }

    val ita = Iterator(1, 2, 3, 4,5)
    val itb = Iterator(11,22,33,44,55)
    println(ita.max)
    println(itb.length)
  }
}

