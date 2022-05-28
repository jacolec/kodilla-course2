package com.kodilla.testing.shape;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

        @Test
        void addTest() {
            //given
            ShapeCollector shapecollector = new ShapeCollector();
            //when
            Shape tempSquare = new Square("square1", 9);
            shapecollector.addFigure(tempSquare);
            //then
            Assertions.assertEquals(tempSquare, shapecollector.getFigure(0));
        }
        @Test
        void removeTest() {
            //given
            ShapeCollector shapecollector = new ShapeCollector();
            Shape tempCircle = new Circle("circle2", 5);
            Shape tempTriangle = new Triangle("triangle2", 10, 6);
            //when
            shapecollector.addFigure(tempCircle);
            shapecollector.addFigure(tempTriangle);
            shapecollector.removeFigure(tempCircle);
            //then
            Assertions.assertEquals(tempTriangle, shapecollector.getFigure(0));
        }

        @Test
        void getTest() {
            //given
            ShapeCollector shapecollector = new ShapeCollector();
            Shape square3 = new Square("square3", 4);
            Shape circle3 = new Circle("circle3", 7);
            Shape triangle3 = new Triangle("triangle3",11, 5);
            //when
            shapecollector.addFigure(square3);
            shapecollector.addFigure(circle3);
            shapecollector.addFigure(triangle3);
            //then
            Assertions.assertEquals(circle3, shapecollector.getFigure(1));
        }
        @Test
        void showTest() {
            //given
            ShapeCollector shapecollector = new ShapeCollector();
            Shape square4 = new Square("square4", 14);
            //when
            shapecollector.addFigure(square4);
            String expectedFigure = square4.toString();
            String tempFigure = shapecollector.showFigures();
            //then
            Assertions.assertEquals(expectedFigure, tempFigure);
        }


}
