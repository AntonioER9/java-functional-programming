package com.antonio.functional.programming.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        // Example usage of Function interface
        Function<Integer, String> intToString = Object::toString;
        String result = intToString.apply(42);
        System.out.println("Converted Integer to String: " + result);

        // Example usage of BiFunction interface
        BiFunction<Integer, Integer, Integer> sum = Integer::sum;
        int sumResult = sum.apply(5, 3);
        System.out.println("Sum of 5 and 3: " + sumResult);
    }

}
