package com.antonio.functional.programming.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> isEven = number -> number % 2 == 0;
        boolean result = isEven.test(4);
        System.out.println("Is 4 even? " + result);

        BiPredicate<Integer, Integer> isGreaterThan = (a, b) -> a > b;
        boolean comparisonResult = isGreaterThan.test(5, 3);
        System.out.println("Is 5 greater than 3? " + comparisonResult);
    }

}
