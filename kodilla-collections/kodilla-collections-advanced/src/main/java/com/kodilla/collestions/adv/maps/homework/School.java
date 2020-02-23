package com.kodilla.collestions.adv.maps.homework;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private String name;

    private List<Integer>students=new ArrayList<>();

    public School(String name, int ...students) {
        this.name=name;
        for(int student:students)
            this.students.add(student);
    }
    public String getName() {
        return name;
    }
    public int getSumOfStudents(){
        int sum=0;
        for(int student:students)
            sum=sum+student;
        return sum;
    }
    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        School school = (School) o;
        return name.equals(school.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
