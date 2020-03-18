package com.kodilla.stream.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Student1", new Teacher("Teacher1")));
        students.add(new Student("Student2", new Teacher("Teacher2")));
        students.add(new Student("Student3", null));
        students.add(new Student("Student4", null));
        students.add(new Student("Student5", new Teacher("Teacher5")));

        for (Student student : students) {
            System.out.println("uczeń: " + student.getName() + " nauczyciel: " + student.getTeacher().getName());
        }
    }
}
