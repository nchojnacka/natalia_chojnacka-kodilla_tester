package com.kodilla.inheritance.homework;

public class OperatingSystem {

    // dwie zmienne prywatne
    private int linux;
    private int macOs;
    //konstruktor Car
    public OperatingSystem(int linux, int macOs) {
        this.linux = linux;
        this.macOs = macOs;
    }

    public void turnOn() {
        System.out.println("System jest włączony do 31.12.2021r");
    }

    public void turnOff() {
        System.out.println("System jest wyłączony");
    }

}
