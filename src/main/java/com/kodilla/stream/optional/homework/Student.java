package com.kodilla.stream.optional.homework;

import java.util.Objects;

public class Student {
    public String name;
    public Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return Objects.equals(getName(), student.getName()) &&
                Objects.equals(getTeacher(), student.getTeacher());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getTeacher());
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", teacher='" + teacher + '\'' + '}';
    }

}
