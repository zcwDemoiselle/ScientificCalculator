package com.zipcodewilmington.scientificcalculator;

import javax.swing.*;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        JOptionPane optionPane = new JOptionPane();
        String welcome = "\n\n\nWelcome to our calculator!\n\n\n";
        JOptionPane.showMessageDialog(null, welcome, "Demoiselle Calculator", JOptionPane.PLAIN_MESSAGE);

        loop:
        while (true) {
            String input = JOptionPane.showInputDialog("Enter an operation: ");
            double result = 0;

            String num1 = RegexParser.extractNumber(input);
            String operator = RegexParser.extractOperator(input);
            assert num1 != null;
            assert operator != null;
            String num2 = RegexParser.extractNumber(input.substring(num1.length() + operator.length()).trim());

            if (num2 == null) {
                result = calculator.performUnaryOperation(Double.parseDouble(num1), operator);
            } else {
                result = calculator.performBinaryOperation(Double.parseDouble(num1), Double.parseDouble(num2), operator);
            }
            result = Console.handleRemainder(result);
            Console.println(String.valueOf(result));
            JOptionPane.showMessageDialog(null, String.valueOf(result));
        }
    }
}