package com.antonio.functional.programming.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleCollections {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        names.forEach(name -> {
            System.out.println("Hello, " + name + "!");
        });

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        numbers.removeIf(n -> n % 2 == 0); // Remove even numbers
        System.out.println("Odd numbers: " + numbers);

        List<String> words = new ArrayList<>(List.of("apple", "banana", "cherry"));

        words.replaceAll(String::toUpperCase); // Convert all words to uppercase
        System.out.println("Uppercase words: " + words);
    }

}
