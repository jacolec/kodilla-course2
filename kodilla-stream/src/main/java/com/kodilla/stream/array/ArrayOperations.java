package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {

    static double getAverage(final int[] numbers) {

       IntStream display = IntStream.range(numbers[0], (numbers[(numbers.length - 1)]));
       display.forEach(System.out::println);


        OptionalDouble average = IntStream.range(numbers[0], (numbers[(numbers.length - 1)]))
                .average();
        double avr = average.getAsDouble();

        return avr;
    }
}
