package com.zipcodewilmington.scientificcalculator;

import java.lang.Math;

public class Calculator {
    public double performOperation(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return Console.multiplication(num1, num2);
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
            case "%":
                return num1 % num2;
            case "^":
                return Math.pow(num1, num2);
            case "log(":
                return Math.log(num2) / Math.log(num1); // Logarithm with base num1
            case "!":
                return Console.factorial(num1);
            case "h":
            case "help":
                Console.showHelp();
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
