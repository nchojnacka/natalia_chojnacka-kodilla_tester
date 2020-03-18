package com.kodilla.stream.optional.homework;

import java.util.Optional;

public class Student {
    public String name;
    public Teacher teacher;

    public Student(String name, Teacher teacher) {
        Optional<Teacher> optionalTeacher = Optional.ofNullable(teacher);
        this.name = name;
        this.teacher = optionalTeacher.orElse(new Teacher("undefined"));
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

}
