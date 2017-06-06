package net.bigdataer.demo.juice

class InfoLog extends Log{
  override def debug(): Unit = {
    println("this is debug level log")
  }
}
