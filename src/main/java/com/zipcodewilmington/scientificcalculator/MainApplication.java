package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        RegexParser regexParser = new RegexParser();
        Calculator calculator = new Calculator();

        Console.println("Welcome to the Demoiselle Calculator!");
        while (true) {
            String input = Console.getStringInput("");

            String num1 = regexParser.extractNumber(input);
            String operator = regexParser.extractOperator(input);
            String num2 = regexParser.extractNumber(input.substring(num1.length() + operator.length()).trim());

            double result = calculator.performOperation(Double.parseDouble(num1), Double.parseDouble(num2), operator);
            System.out.println(result);
        }
    }

}
