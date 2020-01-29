package com.kodilla.abstracts.homework;

public class Person {

    private String firstName;
    private int age;
    private Job job;
    private Programmer programmer;

    public Person(String firstName, int age, Job job, Programmer programmer) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
        this.programmer = programmer;
    }

    public static void main(String[] args) {

        Programmer programmer = new Programmer("programming", 20000);
        programmer.displayResponsibilities();
    }
}
