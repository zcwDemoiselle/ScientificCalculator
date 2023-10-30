package com.zipcodewilmington.scientificcalculator;

import java.lang.Math;

public class Calculator {
    public double performUnaryOperation(double number1, String operator) {
        switch (operator) {
            case "log(":
                return Math.log(number1); // Logarithm with base 10
            case "sqrt(":
                return Math.sqrt(number1);
            //case "h":
            case "help":
                Console.showHelp();
            case "!":
                return Console.factorial(number1);
            case "1/x":
                return Console.inverse(number1);
            case "-x":
                return Console.switchSign(number1);
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
    public double performBinaryOperation(double number1, double number2, String operator) {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return Console.multiplication(number1, number2);
            case "/":
                if (number2 != 0) {
                    return number1 / number2;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed.");
                }
            case "%":
                return Console.modulus(number1, number2);
            case "^":
                return Math.pow(number1, number2);
            case "log(":
                return Math.log(number2) / Math.log(number1); // Logarithm with base num1
            case "!":
                return Console.factorial(number1);
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
    public String performOther(String operator) {
        switch (operator) {
            case "h":
            case "help":
                Console.showHelp();
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
