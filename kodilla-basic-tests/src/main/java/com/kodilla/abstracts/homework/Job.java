package com.kodilla.abstracts.homework;

public abstract class Job {

    private String responsibilities;
    private int salary;

    public Job (String responsibilities, int salary) {
        this.responsibilities = responsibilities;
        this.salary = salary;
    }

    public abstract void getSalary();
    public abstract void getWorkplace();
    public abstract void displayResponsibilities();

}
