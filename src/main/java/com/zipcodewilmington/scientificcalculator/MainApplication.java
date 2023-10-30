package com.zipcodewilmington.scientificcalculator;

import javax.swing.*;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame(); // to create a frame

        RegexParser regexParser = new RegexParser();
        Calculator calculator = new Calculator();

//        Console.println("Welcome to the Demoiselle Calculator!");
        JOptionPane.showMessageDialog(null, "Welcome to the Demoiselle Calculator!");
        loop:
        while (true) {
            String input = JOptionPane.showInputDialog("");
            double result = 0;

            String num1 = RegexParser.extractNumber(input);
            String operator = RegexParser.extractOperator(input);
            assert num1 != null;
            assert operator != null;
            String num2 = RegexParser.extractNumber(input.substring(num1.length() + operator.length()).trim());

            if (num2 == null) {
                result = calculator.performUnaryOperation(Double.parseDouble(num1), operator);
            }
            else {
                result = calculator.performBinaryOperation(Double.parseDouble(num1), Double.parseDouble(num2), operator);
            }
            Console.println(String.valueOf(result));
        }
    }
}

