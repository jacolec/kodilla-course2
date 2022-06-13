package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(final int[] numbers) {

        IntStream x = IntStream.range(0, numbers.length)
                .map(i -> numbers[i]);
        System.out.println(x);

        OptionalDouble average = IntStream.range(0, numbers.length)
                .map(i -> numbers[i])
                .average();
        double avr = average.getAsDouble();

        return avr;
    }
}
