package com.kodilla.testing.shape;

class Triangle implements Shape {
    String name;
    double field;
    double b;
    double h;

    public String getShapeName() {
        return this.name;
    }
    public double getField() {
        field = (b * h) / 2;
        return this.field;
    }

    public String getName() {
        return name;
    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }

    public Triangle(String name, double b, double h) {
        this.name = name;
        this.b = b;
        this.h = h;
    }
}
