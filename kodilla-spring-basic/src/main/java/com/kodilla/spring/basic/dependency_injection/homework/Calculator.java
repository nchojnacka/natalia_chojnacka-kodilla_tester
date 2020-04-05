package com.kodilla.spring.basic.dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator extends Display {
    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public Display getDisplay() {
        return display;
    }

    public double add(double a, double b) {
        double sum = a + b;
        display.display(sum);
        return sum;
    }

    public double subtract(double a, double b) {
        double subtract = a - b ;
        display.display(subtract);
        return subtract ;
    }

    public double multiply(double a, double b) {
        double multiply = a * b ;
        display.display(multiply);
        return multiply;
    }

    public double divide(double a, double b) {
        double divide = a/b;
        display.display(divide);
        return divide;
    }
}
