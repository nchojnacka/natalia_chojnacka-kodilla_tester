package com.kodilla.stream.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Student1", new Teacher("Teacher1")));
        students.add(new Student("Student2", new Teacher("Teacher2")));
        students.add(new Student("Student3", new Teacher(null)));
        students.add(new Student("Student4", new Teacher(null)));
        students.add(new Student("Student5", new Teacher("Teacher5")));

        Teacher teacher = new Teacher("undefinied");
        for (Student student : students) {
            Optional<String> optionalTeacher = Optional.ofNullable(student.getTeacher().getName());
            System.out.println("uczeń: " + student.getName() + " nauczyciel: " + optionalTeacher.orElse("undefinied"));
        }
    }
}
