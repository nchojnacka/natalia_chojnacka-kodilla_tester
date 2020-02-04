package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {

        Bmw bmw = new Bmw(100);
        doRace(bmw);

        Mercedes mercedes = new Mercedes(100);
        doRace(mercedes);

        Audi audi = new Audi(100);
        doRace(audi);
    }

    public static void doRace(Car car) {

        for (int i = 0; i < 3; i++) {
            car.increaseSpeed();
        }

        for (int i = 0; i < 2; i++) {
            car.decreaseSpeed();
        }
        System.out.println(car.getSpeed());
    }
}
