package com.kodilla.spring.basic.spring_dependency_injectio.homework;

public class DeliveryService {

    public boolean deliverPackage(String address, double weight) {
        if (weight > 30) {
            System.out.println("Package to heavy.");
            return false;
        }
        System.out.println("Delivering in progress...");
        return true;
    }
}