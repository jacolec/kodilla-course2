package com.kodilla.testing.shape;

class Circle implements Shape {
    String name;
    double r;
    double field;

    public String getShapeName() {
        return this.name;
    }
    public double getField() {
        field = 3.14 * r * r;
        return this.field;
    }

    public String getName() {
        return name;
    }

    public double getR() {
        return r;
    }

    public Circle(String name, double r) {
        this.name = name;
        this.r = r;
    }
}
