package net.bigdataer.demo.juice;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class InjectionConfig {

    private People student;
    private People teacher;

    public People getStudent() {
        return student;
    }

    @Inject
    public void setStudent(@Named("Student") People student) {
        this.student = student;
    }

    public People getTeacher() {
        return teacher;
    }

    @Inject
    public void setTeacher(@Named("Teacher") People teacher) {
        this.teacher = teacher;
    }
}
