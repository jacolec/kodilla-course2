package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class Calculator {

    private final double a;
    private final double b;

    public Calculator(final double a, final double b) {
        this.a = a;
        this.b = b;
    }

    @Autowired
    private Display display;

    public double add(double a, double b) {
        System.out.println("Adding variable a to variable b...");
        double val = a + b;
        display.displayValue(val);
        return val;
    }

    public double sub(double a, double b) {
        System.out.println("Subtracting variable a from variable b...");
        double val = b - a;
        display.displayValue(val);
        return val;
    }

    public double mul(double a, double b) {
        System.out.println("Multiplying variable a by variable b...");
        double val = a * b;
        display.displayValue(val);
        return val;
    }

    public double div(double a, double b) {
        System.out.println("Dividing variable a by variable b...");
        double val = a / b;
        display.displayValue(val);
        return val;
    }


}
