package com.kodilla.testing.user;

public class calculator {
    private int a;
    private int b;

    public calculator (int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int add (int a, int b) {
        int sum = a + b;
        return sum;
    }
    public int subtract (int a, int b) {
        int sbt = a -b;
        return sbt;
    }

}
