package com.kodilla.testing.shape;

class Square implements Shape {
    String name;
    double field;
    double a;

    public String getShapeName() {
        return this.name;
    }
    public double getField() {
        field = a * a;
        return this.field;
    }

    public String getName() {
        return name;
    }

    public double getA() {
        return a;
    }

    public Square(String name, double a) {
        this.name = name;
        this.a = a;
    }
}
