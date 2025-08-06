package com.antonio.functional.programming;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

		// Operation operation = (a, b) -> a + b;
		Operation operation = new Operation() {
			/**
			 * Es una clase anonima que implementa la interfaz Operation.
			 * This method implements the operate method of the Operation interface.
			 * It takes two integers and returns their sum.
			 *
			 * @param a the first integer
			 * @param b the second integer
			 * @return the sum of a and b
			 */
			@Override
			public int operate(int a, int b) {
				return a + b;
			}
		};

		System.out.println("Result: " + operation.operate(5, 3));
	}

}

@FunctionalInterface
interface Operation {
	int operate(int a, int b);

	default String show() {
		return "This is a default method in the Operation interface.";
	}

	//
	static Operation substraction() {
		return (a, b) -> a - b;
	}
}