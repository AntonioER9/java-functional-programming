package com.antonio.functional.programming.optional;

import java.util.Optional;

public class OptionalTest2 {

    public static void main(String[] args) {

        Optional<String> name = Optional.of("Antonio");
        String nameUpperCase = name
                .map(String::trim)
                .map(String::toUpperCase)
                .orElse("DESCONOCIDO");
        System.out.println(nameUpperCase);

        Optional<Optional<String>> optionalOfOptional = Optional.of(Optional.of("Valor interno"));

        Optional<String> resultFlatMap = optionalOfOptional.flatMap(op -> op);

        System.out.println(resultFlatMap);
    }

}
