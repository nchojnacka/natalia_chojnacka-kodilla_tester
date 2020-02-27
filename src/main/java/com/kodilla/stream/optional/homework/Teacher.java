package com.kodilla.stream.optional.homework;

import java.util.Objects;

public class Teacher {
    public String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(getName(), teacher.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

}
