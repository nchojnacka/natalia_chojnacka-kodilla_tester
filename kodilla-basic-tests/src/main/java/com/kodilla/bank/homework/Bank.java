package com.kodilla.bank.homework;

public class Bank {

    private String name;
    private CashMachine [] cashMachines;
    private int size;


    public Bank (String name) {
        this.name = name;

        this.cashMachines = new CashMachine[5];
    }

    public void add (CashMachine machine) {
        if (this.size < 4) {
            cashMachines[this.size] = machine;
            this.size++;
        }
    }

    public int getBalance() {
        int balance = 0;
        for (int i= 0; i <5; i++) {
            CashMachine temp = cashMachines[i];
            if (temp != null) {
                balance += temp.getBalance();
            }
        }
        return balance;
    }

    public int getCountOfWithdraws() {
        int count = 0;
        for (int i = 0; i <5; i++) {
            CashMachine temp = cashMachines[i];
            if (temp != null) {
                count += temp.getCountOfWithdraws();
            }
        }
        return count;
    }

    public int getSumOfWithdraws() {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            CashMachine temp = cashMachines[i];
            if (temp != null) {
                sum += temp.getWithdraw();
            }
        }
        return sum;
    }

    public int getAverageOfWithdraws () {
        return getSumOfWithdraws()/getCountOfWithdraws();
    }

    public int getCountOfPayments() {
        int count = 0;
        for (int i = 0; i < 5; i++ ) {
            CashMachine temp = cashMachines[i];
            if (temp != null) {
                count += temp.getCountOfPayments();
            }
        }
        return count;
    }

    public int getSumOfPayments() {
        int sum = 0;
        for (int i =0; i <5;i++) {
            CashMachine temp = cashMachines[i];
            if (temp != null) {
                sum += temp.getPayment();
            }
        }
        return sum;
    }

    public int getAverageOfPayments() {
        return getSumOfPayments()/getCountOfPayments();
    }
}
