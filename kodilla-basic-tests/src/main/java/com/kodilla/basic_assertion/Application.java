package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int c = 10;
        int d = 9;
        int f = 2;
        int g = 4;
        int sumResult = calculator.sum(a, b);
        int powerResult = calculator.power(f, g);

        boolean powerCorrect = ResultChecker.assertEquals(16,powerResult);
        System.out.println("Potęga z liczb " + f + " i " + g + " to " + calculator.power(f, g));
        if(powerCorrect) {
            System.out.println("Metoda potęgowania działa poprawnie");
        } else {
            System.out.println("Metoda potęgowania nie działa poprawnie");
        }

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
