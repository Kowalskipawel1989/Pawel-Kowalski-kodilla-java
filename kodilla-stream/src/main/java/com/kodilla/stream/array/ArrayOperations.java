package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static int getAverage(int[] numbers){
        IntStream.range(0, numbers.length);
        IntStream.range(0, numbers[20])
                .average();
        return numbers.length;
    }
}
