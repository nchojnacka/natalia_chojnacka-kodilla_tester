package com.kodilla.basic_assertion;

public class Calculator {

    public int sum(int a, int b) {
        return Math.addExact(a, b);
    }

    public int substract(int a, int b) {
        return Math.subtractExact(a, b);
    }

    public int power(int a, int b){

        int flag = 0;
        int wynik = 1;
        while(flag < b) {
            wynik = wynik * a;
            flag++;
        }

        return wynik;
    }
}
