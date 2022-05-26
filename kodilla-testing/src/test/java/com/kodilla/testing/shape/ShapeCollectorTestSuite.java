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
            Square square1 = new Square("square1", 6);
            square1.addFigure();
            //when


            //then
            Assertions.assertEquals(Square(), tempShape1);
        }
        @Test
        void removeTest() {
            //given
            List<Shape> shapeArray2 = new ArrayList<>();
            shapeArray2.add(new Triangle());
            shapeArray2.add(new Circle());
            shapeArray2.add(new Square());
            //when
            Shape tempShape2 =

            //then
            Assertions.assertEquals(0, a);
        }
    }


        @Test
        void getTest() {
            //given
            List<Shape> tempList3 = new ArrayList<>();
            tempList3.add(triangle2);
            tempList3.add(circle3);
            tempList3.add(square3);
            int x = 2;
            Shape tempShape = tempList3.get(x);
            //when
            Shape result  = tempList3.getFigure(2);
            //then
            Assertions.assert(tempShape, result);

        }

}
