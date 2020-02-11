package com.kodilla.bank.homework;

public class CashMachine {

    private int[] transactions;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
    }

    public void add(int transaction) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = transaction;
        this.transactions = newTab;
    }

    public int getBalance() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int balance = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            balance += this.transactions[i];
        }
        return balance;
    }

    public int getWithdraw() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int withdraw = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] < 0) {
                withdraw -= this.transactions[i];

                System.out.println("Wartosc po odehmowaniu " + withdraw);
            }
        }
        return withdraw;
    }

    public int getCountOfWithdraws() {
        int count = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] < 0) {
                count++;
            }
        }
        return count;
    }

    public int getPayment() {
        if (this.transactions.length == 0) {
            return 0;
        }
        int payment = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] > 0) {
                payment += this.transactions[i];
            }
        }
        return payment;
    }

    public int getCountOfPayments() {
        int count = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            if (this.transactions[i] > 0) {
                count++;
            }
        }
        return count;
    }
}