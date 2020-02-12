//package com.kodilla.collections.arrays.homework;
//
//import com.kodilla.collections.interfaces.homework.Audi;
//import com.kodilla.collections.interfaces.homework.Bmw;
//import com.kodilla.collections.interfaces.homework.Car;
//import com.kodilla.collections.interfaces.homework.Mercedes;
//
//import java.util.Random;
//
//public class CarsApplication {
//
//    public static void main(String[] args) {
//        Random random = new Random();
//        Car[] cars = new Car[random.nextInt(15) + 1];
//        for (int i = 0; i < cars.length; i++)
//            cars [i] = drawCar();
//        for (Car car : cars)
//            CarUtils.describeCar(car);
//    }
//
//    private static Car drawCar() {
//        Random random = new Random();
//        int drawnCarBrand = random.nextInt(3);
//        double c = random.nextDouble() * 100 + 1;
//        if (drawnCarBrand == 0)
//            return new Audi(c);
//        else if (drawnCarBrand == 1)
//            return new Bmw(c);
//        else
//            return new Mercedes(c);
//    }
//}
