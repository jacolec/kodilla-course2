package com.kodilla.testing.shape;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.field, field) == 0 && Double.compare(triangle.b, b) == 0 && Double.compare(triangle.h, h) == 0 && name.equals(triangle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, field, b, h);
    }

    @Override
    public String toString() {
        return "shape: " + name + ", " + "field: " + field;
    }
}
