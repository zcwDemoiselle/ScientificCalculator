package com.zipcodewilmington.scientificcalculator;

import javax.swing.*;

/**
 * Created by leon on 2/9/18.
 */
public class PrintDebug {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        Console.println("Welcome to Demoiselle Calculator");

        loop:
        while (true) {
            String input = Console.getStringInput("Enter an operation: ");
            double result;

            String num1 = RegexParser.extractNumber(input);
            String operator = RegexParser.extractOperator(input);
            String num2 = RegexParser.extractNumber(input.substring(num1.length() + operator.length()).trim());

            if (num2 == null) {
                result = calculator.performUnaryOperation(Double.parseDouble(num1), operator);
            } else {
                result = calculator.performBinaryOperation(Double.parseDouble(num1), Double.parseDouble(num2), operator);
            }
            result = Console.handleRemainder(result);
            Console.println(String.valueOf(result));
        }
    }
}