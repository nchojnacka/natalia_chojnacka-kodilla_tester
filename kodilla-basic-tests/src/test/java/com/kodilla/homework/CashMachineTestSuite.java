package com.kodilla.homework;

import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void countBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(10);
        cashMachine.add(20);
        cashMachine.add(50);
        cashMachine.add(0);

        assertEquals(90, cashMachine.getBalance());
    }

    @Test
    public void countWithdraw() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(25);
        cashMachine.add(-25);
        cashMachine.add(-25);
        cashMachine.add(25);
        cashMachine.add(1);

        assertEquals(60, cashMachine.getWithdraw());
    }

    @Test
    public void countOfWithdraws() {
        CashMachine cashMachine = new CashMachine ();
        cashMachine.add(100);
        cashMachine.add(200);
        cashMachine.add(-100);
        cashMachine.add(20);
        cashMachine.add(25);

        assertEquals(245, cashMachine.getCountOfWithdraws());
    }

    @Test
    public void countPayments() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(0);
        cashMachine.add(10);
        cashMachine.add(-10);
        cashMachine.add(10);
        cashMachine.add(20);

        assertEquals(30, cashMachine.getPayment());
    }

    @Test
    public void countOfPayments() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(50);
        cashMachine.add(60);
        cashMachine.add(70);
        cashMachine.add(80);
        cashMachine.add(0);

        assertEquals(260, cashMachine.getCountOfPayments());
    }
}
