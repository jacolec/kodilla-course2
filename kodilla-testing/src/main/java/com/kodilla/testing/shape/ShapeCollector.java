package com.kodilla.testing.shape;
import java.util.ArrayList;
import java.util.List;

class ShapeCollector {
    private List<Shape> shapeList = new ArrayList<>();

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        Shape x = (Shape) o;
        return (shapeList.get().getShapeName().equals(x.getShapeName()) &&
                (shapeList.get().getField() == x.getField());
    }

    @Override
    public String toString() {
        return "shape: " + shapeList.get().getShapeName() + ", " + "field: " + shapeList.get().getField();
    }

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeList.remove(shape);
    }

    public int getFigure(int n) {
        Shape tempShape = null;
        for (int n; n < shapeList.size(); n++)
        tempShape = shapeList.get(n);
    }

    public void showFigures() {
        System.out.println(shapeList);
    }

}
