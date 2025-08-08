package com.antonio.functional.programming.record;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<ProductDto> products = List.of(
                new ProductDto("Product 1", 10.0),
                new ProductDto("Product 2", 20.0),
                new ProductDto("Product 3", 30.0));

        List<String> discountedProducts = products.stream()
                .map(productDto -> new ProductDto(productDto.name(), productDto.price() * 0.9))
                .map(productDto -> String.format("%s: $%.2f", productDto.name(), productDto.price()))
                .toList();

        System.out.println("Discounted Products:");
        discountedProducts.forEach(System.out::println);

        Map<String, List<ProductDto>> byPrice = products.stream()
                .collect(Collectors.groupingBy(productDto -> {
                    if (productDto.price() < 15.0) {
                        return "Cheap";
                    } else if (productDto.price() < 25.0) {
                        return "Moderate";
                    } else {
                        return "Expensive";
                    }
                }));

        System.out.println("\nProducts by Price Range:");
        byPrice.forEach((priceRange, productList) -> {
            System.out.println(priceRange + ":");
            productList.forEach(product -> System.out.println(" - " + product.name()));
        });

        // Reducción matemática
        Double total = products.stream()
                .map(ProductDto::price)
                .reduce(0.0, Double::sum);

        // Double total = products.stream()
        // .map(productDto -> productDto.price())
        // .reduce(0.0, (sum, price) -> sum + price);

        System.out.println("\nTotal Price: $" + total);

        String productSummary = products.stream()
                .map(p -> p.name() + " - $" + p.price())
                .reduce("", (s1, s2) -> {
                    if (s1.isEmpty()) {
                        return s2;
                    } else {
                        return s1 + "\n" + s2;
                    }
                });
        System.out.println("\nProduct Summary:");
        System.out.println(productSummary);

        // Conversión entre colecciones
        Set<Double> uniquePrices = products.stream()
                .map(ProductDto::price)
                .collect(Collectors.toSet());

        System.out.println("\nUnique Prices:");
        uniquePrices.forEach(System.out::println);

        Map<String, Double> productMap = products.stream()
                .collect(Collectors.toMap(ProductDto::name, ProductDto::price, (existing, replacement) -> existing));

        System.out.println("\nProduct Map:");
        productMap.forEach((name, price) -> System.out.println(name + ": $" + price));

    }
}
