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

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (field != 0 ? field.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object o) {
        Square s = (Square) o;
        return (this.name.equals(s.getName())) && (this.field == (s.getField()));
    }

    @Override
    public String toString() {
        return "shape: " + name + ", " + "field: " + field;
}
