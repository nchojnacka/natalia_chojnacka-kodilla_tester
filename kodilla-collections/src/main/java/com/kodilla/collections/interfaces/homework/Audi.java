package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {

    int speed;

    public Audi(int speed){
        this.speed = speed;

    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed+=15;
    }

    @Override
    public void decreaseSpeed() {
        speed-=7;
    }
}
