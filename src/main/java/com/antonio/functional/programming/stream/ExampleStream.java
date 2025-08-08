package com.antonio.functional.programming.stream;

import java.util.List;

import java.util.stream.Stream;

public class ExampleStream {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Stream<Integer> streamNumber = numbers.stream();
		streamNumber.forEach(System.out::println);

		Stream<String> streamArray = Stream.of("Antonio", "Maria", "Pedro", "Lucia");
		streamArray.forEach(System.out::println);

		List<String> strings = streamArray.toList();
		System.out.println(strings);

	}

}
