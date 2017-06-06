package net.bigdataer.demo.juice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class NameMain {

    public static void main(String[] args){
       Injector injector = Guice.createInjector(new JuiceModule());
        InjectionConfig config = injector.getInstance(InjectionConfig.class);
        People teacher = config.getTeacher();
        teacher.setId(2);

        People student = config.getStudent();
        student.setId(23);
    }
}
