package com.kodilla.testing.collection;
import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.List;


public class CollectionTestSuite {

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

    @DisplayName("method exterminate() used on empty list should return empty list"
    )
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //given
        List<Integer> newList1 = new ArrayList<>();
        newList1.add(6);
        newList1.add(5);
        newList1.add(9);
        newList1.add(12);
        newList1.add(3);
        newList1.add(4);
        List<OddNumbersExterminator> numbers = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //when
        List<Integer> tempList = exterminator.exterminate(newList1);
        //then
        Assertions.assertEquals(0, tempList.size());
    }
    @DisplayName("checking if method exterminate() returns list of even numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //given
        List<OddNumbersExterminator> testList = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        testList.add(4);
        testList.add(5);
        testList.add(10);
        testList.add(7);
        //when
        exterminator.exterminate(testList);
        int result;
        for (int i=0; i<testList.size(); i++) {
        result = testList.get(i) % 2;
        }
        //then
        Assertions.assertEquals(0, result);
    }
}
