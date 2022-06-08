package com.kodilla.testing.shape;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.field, field) == 0 && Double.compare(square.a, a) == 0 && name.equals(square.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, field, a);
    }

    @Override
    public String toString() {
        return "shape: " + name + ", " + "field: " + field; }
}
