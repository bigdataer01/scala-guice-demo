package net.bigdataer.demo.juice

class STeacher extends SPeople{
  override def setId(t: Int): Unit = {
    println(t)
  }
}
