package com.kodilla.inheritance.homework;

public class OperatingSystem {

    int year;
    int version;
    String admin;

    public OperatingSystem(int year, int version, String admin){
        this.year = year;
        this.version = version;
        this.admin = admin;
    }

    public void turnOn(){
        System.out.println("Turn on");
    }

    public void turnOff(){
        System.out.println("Turn off");
    }
}
