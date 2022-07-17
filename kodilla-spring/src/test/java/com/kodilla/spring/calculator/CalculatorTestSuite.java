package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void addTest() {
        //Given
        //When
        double result = calculator.add(10, 2);
        //Then
        Assertions.assertEquals(12, result);
    }

    @Test
    void subTest() {
        //Given
        //When
        double result = calculator.sub(10, 15);
        //Then
        Assertions.assertEquals(5, result);
    }

    @Test
    void mulTest() {
        //Given
        //When
        double result = calculator.mul(4, 5);
        //Then
        Assertions.assertEquals(20, result);
    }

    @Test
    void divTest() {
        //Given
        //When
        double result = calculator.div(32, 8);
        //Then
        Assertions.assertEquals(4, result);
    }
}
