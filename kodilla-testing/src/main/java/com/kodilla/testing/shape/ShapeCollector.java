package com.kodilla.testing.shape;
import java.util.ArrayList;
import java.util.List;

class ShapeCollector {
    private List<Shape> shapeList = new ArrayList<>();

    public ShapeCollector(Shape shape) {
        return this.shape;
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
