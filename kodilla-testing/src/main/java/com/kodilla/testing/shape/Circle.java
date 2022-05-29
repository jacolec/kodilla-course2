package com.kodilla.testing.shape;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.r, r) == 0 && Double.compare(circle.field, field) == 0 && name.equals(circle.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, r, field);
    }

    @Override
    public String toString() {
        return "shape: " + name + ", " + "field: " + field;
    }
}
