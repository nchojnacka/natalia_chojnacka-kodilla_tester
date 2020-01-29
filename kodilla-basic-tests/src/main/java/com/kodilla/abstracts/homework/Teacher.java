package com.kodilla.abstracts.homework;

public class Teacher extends Job {

    private int salary;

    public Teacher(int salary) {
        super("teaching", 2000);
        this.salary = salary;
    }

    @Override
    public void getSalary() {
        System.out.println("Teacher don't earn a lot of money");
    }

    @Override
    public void getWorkplace() {
        System.out.println("Teacher is teaching at school");
    }

    @Override
    public void displayResponsibilities() {
        System.out.println("Teacher transmits knowledge");
    }
}
