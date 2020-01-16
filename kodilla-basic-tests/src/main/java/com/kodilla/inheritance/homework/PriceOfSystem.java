package com.kodilla.inheritance.homework;

public class PriceOfSystem extends OperatingSystem {

    public PriceOfSystem(int linux, int macOs) {
        super(linux, macOs);
    }

    @Override
    public void turnOn(){
        System.out.println("System jest włączony do 31.12.2020r");
    }
}
