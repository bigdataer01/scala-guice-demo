package net.bigdataer.demo.juice

import com.google.inject.name.Names
import com.google.inject.{Binder, Module}

class SJuiceModule extends Module{
  override def configure(binder: Binder): Unit = {
    binder.bind(classOf[SPeople]).annotatedWith(Names.named("Teacher")).to(classOf[STeacher])
    binder.bind(classOf[SPeople]).annotatedWith(Names.named("Student")).to(classOf[Sstudent])

    binder.bind(classOf[Log]).to(classOf[InfoLog])
  }
}
