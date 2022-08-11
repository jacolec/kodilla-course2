package com.kodilla.patterns.factory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ShapeFactoryTestSuite {

    @Test
    void testFactoryCircle() {
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();
        //When
        Shape circle = shapeFactory.makeShape(ShapeFactory.CIRCLE);
        //Then
        Assertions.assertEquals(Math.PI * Math.pow(4.50, 2.0), circle.getArea());
        Assertions.assertEquals("The rounded circle", circle.getName());
    }

    @Test
    void testFactoryRectangle() {
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();
        //When
        Shape rectangle = shapeFactory.makeShape(ShapeFactory.RECTANGLE);
        //Then
        Assertions.assertEquals(45.0, rectangle.getArea(), 0);
        Assertions.assertEquals("The long rectangle", rectangle.getName());
    }

    @Test
    void testFactorySquare() {
        //Given
        ShapeFactory shapeFactory = new ShapeFactory();
        //When
        Shape square = shapeFactory.makeShape(ShapeFactory.SQUARE);
        //Then
        Assertions.assertEquals(28.0, square.getCircumference(), 0);
        Assertions.assertEquals("The angular square", square.getName());

    }
}
