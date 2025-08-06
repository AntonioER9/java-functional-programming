package com.antonio.functional.programming.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> printConsumer = message -> System.out.println("Message: " + message);
        printConsumer.accept("Hello, Consumer!");

        BiConsumer<String, Integer> biConsumer = (name, age) -> System.out
                .println(name + " is " + age + " years old.");
        biConsumer.accept("Alice", 30);
    }

}
