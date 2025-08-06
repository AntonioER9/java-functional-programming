package com.antonio.functional.programming.task;

public class Calculator {

    public void operateAndPrint(Operation operation, int a, int b) {
        int result = operation.operate(a, b);
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.operateAndPrint((a, b) -> a + b, 5, 3);

        Operation subtraction = Operation.substraction();
        calculator.operateAndPrint(subtraction, 5, 3);
    }

}

@FunctionalInterface
interface Operation {
    int operate(int a, int b);

    default String show() {
        return "This is a default method in the Operation interface.";
    }

    static Operation substraction() {
        return (a, b) -> a - b;
    }
}