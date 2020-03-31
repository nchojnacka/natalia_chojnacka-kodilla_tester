package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();
        NotificationService dhlNotificationService = new DhlDeliveryService();
        NotificationService dpdNotificationService = new DpdDeliveryService();

        ShippingCenter shippingCenter = new ShippingCenter(deliveryService, dhlNotificationService);
        shippingCenter.sendPackage("Nowy Świat, Warsaw", 15.5);
        shippingCenter.sendPackage("Elektryków, Gdańsk", 30.3);

        ShippingCenter shippingCenter1 = new ShippingCenter(deliveryService, dpdNotificationService);
        shippingCenter1.sendPackage("Wall Street, New York", 5.00);
        shippingCenter1.sendPackage("Floriańska, Kraków", 0.5);
    }
}