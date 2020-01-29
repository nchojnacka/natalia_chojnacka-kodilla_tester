package com.kodilla.abstracts.homework;

public class Programmer extends Job {

    public Programmer(String responsibilities, int salary) {
        super(responsibilities, salary);
    }

    @Override
    public void getSalary() {
        System.out.println("Programmer earn good money");
    }

    @Override
    public void getWorkplace() {
        System.out.println("Programmer can have often home office");
    }

    @Override
    public void displayResponsibilities() {
        System.out.println("Programmer is implementing new solutions");
    }
}
