package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        RegexParser regexParser = new RegexParser();
        Calculator calculator = new Calculator();
        CalculatorState calculatorState = new CalculatorState();

        Console.println("Welcome to the Demoiselle Calculator!");
        loop:
        while (true) {
            double currentNumber = calculatorState.getCurrentValue();
            String input = Console.getStringInput("");
            double result = 0;

            String num1 = regexParser.extractNumber(input);
            String operator = regexParser.extractOperator(input);
            String num2 = regexParser.extractNumber(input.substring(num1.length() + operator.length()).trim());

            if (num2 == null) {
                result = calculator.performUnaryOperation(Double.parseDouble(num1), operator);
            }
            else {
                result = calculator.performBinaryOperation(Double.parseDouble(num1), Double.parseDouble(num2), operator);
            }
            Console.println(String.valueOf(result));

            // Update the calculator state with the result
//            calculatorState.setCurrentValue(result);

            // Print the current number to the terminal
//            Console.println("Current Number: " + result);
        }
    }
}

