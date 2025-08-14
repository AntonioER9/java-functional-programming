package com.antonio.functional.programming.optional;

import java.util.Optional;

public class OptionalTest {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Antonio");

        if (name.isPresent()) {
            System.out.println("El nombre está presente");
        }

        String value = null;

        Optional<String> optionalValue = Optional.ofNullable(value);

        if (optionalValue.isPresent()) {
            System.out.println("El valor está presente");
        } else {
            System.out.println("El valor no está presente");
        }

        optionalValue.ifPresentOrElse(
                message -> System.out.println("El valor está presente: " + message),
                () -> System.out.println("El valor no está presente"));

    }
}
