package net.bigdataer.demo.juice

import com.google.inject.Guice

object Main {

  def main(args: Array[String]): Unit = {

    val injector = Guice.createInjector(new SJuiceModule())
    val config = injector.getInstance(classOf[SInjectionConfig])
    val teacher = config.teacher
    val student = config.student
    val log = config.log
    teacher.setId(12)
    student.setId(22)
    log.debug()

  }
}
