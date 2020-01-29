package com.kodilla.homework;

import com.kodilla.bank.homework.Bank;
import com.kodilla.bank.homework.CashMachine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void countBalance() {
        CashMachine machine1 = new CashMachine();
        machine1.add(10);
        CashMachine machine2 = new CashMachine();
        machine2.add(20);
        CashMachine machine3 = new CashMachine();
        machine3.add(50);
        CashMachine machine4 = new CashMachine();
        machine4.add(-80);
        CashMachine machine5 = new CashMachine();
        machine5.add(100);

        Bank bank = new Bank("Bank test");
        bank.add(machine1);
        bank.add(machine2);
        bank.add(machine3);
        bank.add(machine4);
        bank.add(machine5);

        assertEquals(100, bank.getBalance());
    }

    @Test
    public void countWithdraws() {
        CashMachine machine1 = new CashMachine();
        machine1.add(5);
        CashMachine machine2 = new CashMachine();
        machine2.add(30);
        CashMachine machine3 = new CashMachine();
        machine3.add(40);
        CashMachine machine4 = new CashMachine();
        machine4.add(80);
        CashMachine machine5 = new CashMachine();
        machine5.add(-100);

        Bank bank = new Bank("Bank test");
        bank.add(machine1);
        bank.add(machine2);
        bank.add(machine3);
        bank.add(machine4);
        bank.add(machine5);

        assertEquals(45, bank.getCountOfWithdraws());
    }

    @Test
    public void countAverageOfWithdraws() {
        CashMachine machine1 = new CashMachine();
        machine1.add(10);
        CashMachine machine2 = new CashMachine();
        machine2.add(20);
        CashMachine machine3 = new CashMachine();
        machine3.add(30);
        CashMachine machine4 = new CashMachine();
        machine4.add(40);
        CashMachine machine5 = new CashMachine();
        machine5.add(50);

        Bank bank = new Bank("Bank test");
        bank.add(machine1);
        bank.add(machine2);
        bank.add(machine3);
        bank.add(machine4);
        bank.add(machine5);

        assertEquals(150, bank.getAverageOfWithdraws());
    }

    @Test
    public void countAverangeOfPayments() {
        CashMachine machine1 = new CashMachine();
        machine1.add(100);
        CashMachine machine2 = new CashMachine();
        machine2.add(0);
        CashMachine machine3 = new CashMachine();
        machine3.add(10);
        CashMachine machine4 = new CashMachine();
        machine4.add(-100);
        CashMachine machine5 = new CashMachine();
        machine5.add(50);

        Bank bank = new Bank("Bank test");
        bank.add(machine1);
        bank.add(machine2);
        bank.add(machine3);
        bank.add(machine4);
        bank.add(machine5);

        assertEquals(60, bank.getAverageOfPayments());
    }
}
