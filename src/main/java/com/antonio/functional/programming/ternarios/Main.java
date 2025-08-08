package com.antonio.functional.programming.ternarios;

public class Main {

    public static void main(String[] args) {

        int age = 10;
        String message;

        message = (age >= 18) ? "You are an adult" : "You are a minor";
        System.out.println(message);

    }
}
