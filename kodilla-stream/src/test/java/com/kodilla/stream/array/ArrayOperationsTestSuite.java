package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        final int[] array1 = new int[20];
        array1[0] = 7;
        array1[1] = 2;
        array1[2] = 10;
        array1[3] = 5;
        array1[4] = 11;
        array1[5] = 1;
        array1[6] = 3;
        array1[7] = 4;
        array1[8] = 15;
        array1[9] = 20;
        array1[10] = 16;
        array1[11] = 5;
        array1[12] = 22;
        array1[13] = 6;
        array1[14] = 9;
        array1[15] = 21;
        array1[16] = 13;
        array1[17] = 30;
        array1[18] = 6;
        array1[19] = 14;
        //When
        double arrAverage = 11;
        double tempAverage = ArrayOperations.getAverage(array1);
        Assertions.assertEquals(arrAverage, tempAverage);
    }
}
