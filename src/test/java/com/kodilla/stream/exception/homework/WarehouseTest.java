package com.kodilla.stream.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTest {

    Warehouse warehouse = new Warehouse();

    @Test
    public void getOrderTest() throws OrderDoesntExistException {
        warehouse.addOrder(new Order("10"));
        warehouse.addOrder(new Order("100"));
        warehouse.addOrder(new Order("200"));
        warehouse.addOrder(new Order("300"));
        Order order = warehouse.getOrder("100");
        assertTrue(order != null);
    }

    @Test(expected = OrderDoesntExistException.class)
    public void getOrderTest_withException() throws OrderDoesntExistException {
        warehouse.addOrder(new Order("10"));
        warehouse.addOrder(new Order("100"));
        warehouse.addOrder(new Order("200"));
        warehouse.addOrder(new Order("300"));
        Order order = warehouse.getOrder("123");
        assertNull(order);
    }
}