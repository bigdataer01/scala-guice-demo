package net.bigdataer.demo.juice;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.name.Names;

public class JuiceModule implements Module {
    public void configure(Binder binder) {
        binder.bind(People.class).annotatedWith(Names.named("Teacher")).to(Teacher.class);
        binder.bind(People.class).annotatedWith(Names.named("Student")).to(Student.class);
    }
}
