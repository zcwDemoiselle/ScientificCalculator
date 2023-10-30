package com.zipcodewilmington.scientificcalculator;

import java.lang.Math;

public class Calculator {
    public double performUnaryOperation(double number1, String operator) {
        switch (operator) {
            case "log(":
                return Console.logarithm(number1); // Logarithm with base 10
            case "ln(":
                return Console.naturalLogarithm(number1);
            case "invlog(":
                return Console.inverseLogarithm(number1); // Logarithm with base 10
            case "invln(":
                return Console.inverseNaturalLogarithm(number1);
            case "sqrt(":
                return Console.squareRoot(number1);
            case "sin(":
                return Console.sine(number1);
            case "cos(":
                return Console.cosine(number1);
            case "tan(":
                return Console.tangent(number1);
            case "asin(":
                return Console.inverseSine(number1);
            case "acos(":
                return Console.inverseCosine(number1);
            case "atan(":
                return Console.inverseTangent(number1);
            case "!":
                return Console.factorial(number1);
            case "1/":
                return Console.inverse(number1);
            case "^2":
                return Console.square(number1);
            case "switch(":
                return Console.switchSign(number1);
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
    public double performBinaryOperation(double number1, double number2, String operator) {
        switch (operator) {
            case "+":
                return Console.addition(number1, number2);
            case "-":
                return Console.subtraction(number1, number2);
            case "*":
                return Console.multiplication(number1, number2);
            case "/":
                return Console.division(number1, number2);
            case "%":
                return Console.modulus(number1, number2);
            case "^":
                return Math.pow(number1, number2);
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
