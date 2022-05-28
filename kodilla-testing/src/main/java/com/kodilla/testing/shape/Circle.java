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
    public int hashCode() {
        return Objects.hash(name, field, r);
    }

    @Override
    public boolean equals(Object o) {
        Circle s = (Circle) o;
        return (this.name.equals(s.getName())) && (this.field == (s.getField()));
    }

    @Override
    public String toString() {
        return "shape: " + name + ", " + "field: " + field;
    }
}
