package net.bigdataer.demo.juice

import com.google.inject.Inject
import com.google.inject.name.Named

class SInjectionConfig {

  //使用named注解绑定多个实现
  @Inject
  @Named("Teacher")
   var teacher:SPeople = _

  @Inject
  @Named("Student")
   var student:SPeople = _

  //普通绑定，绑定一个实现
  @Inject
  var log:Log = _
}
