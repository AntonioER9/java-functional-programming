package com.antonio.functional.programming.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethodsExample {

    public static void main(String[] args) {

        List<String> names = List.of("Antonio", "Maria", "Pedro", "Lucia");
        List<String> longNames = names.stream()
                .filter(name -> name.length() > 3)
                .toList();

        System.out.println(longNames);

        List<Integer> lengthNames = names.stream()
                .map(String::length) // Map each name to its length
                .collect(Collectors.toList()); // Collect lengths of names

        List<List<Integer>> list = List.of(List.of(1, 2), List.of(3, 4));
        List<Integer> flatList = list.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flatList);

        int sum = flatList.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum of flattened list: " + sum);

    }

}
