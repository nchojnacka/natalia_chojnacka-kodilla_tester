package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int c = 10;
        int d = 9;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int substractResult = calculator.substract(c, d);
        boolean correctSubstract = ResultChecker.assertEquals(1, substractResult);
        if (correctSubstract) {
            System.out.println("Metoda substract działa poprawnie dla liczb " + c + " i " + d);
        } else {
            System.out.println("Metoda substract nie działa poprawnie dla liczb " + c + " i " + d);
        }
    }
}
