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
        List<Integer> numbers = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //when
        List<Integer> tempList1 = exterminator.exterminate(newList1);
        //then
        Assertions.assertEquals(0, tempList1.size());
    }
    @DisplayName("checking if method exterminate() returns list of even numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //given
        List<Integer> testList = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        testList.add(4);
        testList.add(5);
        testList.add(10);
        testList.add(7);
        //when
        List<Integer> tempList2 = exterminator.exterminate(testList);
        int result = 0;
        for (int i=0; i<tempList2.size(); i++) {
        result = tempList2.get(i) % 2;
        }
        //then
        Assertions.assertEquals(0, result);
    }
}
