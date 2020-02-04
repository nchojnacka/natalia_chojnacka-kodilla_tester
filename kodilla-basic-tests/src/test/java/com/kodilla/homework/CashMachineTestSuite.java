/*package com.kodilla.homework;

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

        assertEquals(80, cashMachine.getBalance());
    }

    @Test
    public void countWithdraw() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(25);
        cashMachine.add(25);
        cashMachine.add(25);

        assertEquals(75, cashMachine.getWithdraw());
    }

    @Test
    public void countOfWithdraws() {
        CashMachine cashMachine = new CashMachine ();
        cashMachine.add(100);
        cashMachine.add(200);
        cashMachine.add(100);

        assertEquals(400, cashMachine.getCountOfWithdraws());
    }

    @Test
    public void countPayments() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(0);
        cashMachine.add(10);
        cashMachine.add(10);

        assertEquals(20, cashMachine.getPayment());
    }

    @Test
    public void countOfPayments() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(50);
        cashMachine.add(60);
        cashMachine.add(70);

        assertEquals(180, cashMachine.getCountOfPayments());
    }
}
*/