package com.antonio.functional.programming.optional;

import java.util.List;
import java.util.Optional;

public class OptionalTest3 {

    public static void main(String[] args) {
        List<String> names = List.of("Antonio", "Ana", "Pedro", "Maria");

        Optional<String> first = names.stream().findFirst();

        first.ifPresent(System.out::println);

        //example 2

        List<String> emptyList = List.of();

        Optional<String> firstEmpty = emptyList.stream().findFirst();

        firstEmpty.ifPresentOrElse(
            System.out::println,
            () -> System.out.println("No hay elementos en la lista")
        );

        //example 3

        record Product(String name, double price){}
        List<Product> products = List.of(
            new Product("Laptop", 1200.00),
            new Product("Smartphone", 800.00),
            new Product("Tablet", 300.00)
        );

        Optional<Product> expensiveProduct = products.stream()
            .filter(product -> product.price() > 1000)
            .findFirst();

        Product result = expensiveProduct.orElse(new Product("Laptop", 1200.00));

        System.out.println("Producto caro: " + result.name() + " - Precio: " + result.price());

    }

}
