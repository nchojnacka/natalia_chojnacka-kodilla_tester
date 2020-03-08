package com.kodilla.stream.exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("111"));
        warehouse.addOrder(new Order("222"));
        warehouse.addOrder(new Order("333"));
        warehouse.addOrder(new Order("444"));

        try {
            warehouse.getOrder("111");
            warehouse.getOrder("000");
        } catch (OrderDoesntExistException e) {
            System.out.println("This order doesn't exist");
        } finally {
            System.out.println("Thank you for your order");
        }
    }
}
