package com.kodilla.testing.shape;
import java.util.ArrayList;
import java.util.List;

class ShapeCollector {
    private List<Shape> shapeList = new ArrayList<>();

    public ShapeCollector() {
    }

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapeList.remove(shape);
    }

    public Shape getFigure(int n) {
        Shape shape = null;
        //for (n = 0; n < shapeList.size(); n++) {
        shape = shapeList.get(n);//}
        return shape;

    }

    public String showFigures() {
        String myShape = null;
        for (int n = 0; n < shapeList.size(); n++) {
            myShape = shapeList.get(n).toString(); }
        return myShape;
        }

    }



