package com.zipcodewilmington.scientificcalculator;

import javax.swing.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame(); // to create a frame

        Calculator calc = new Calculator();
        double res;
        boolean validOperation = false;
        int number1 = 0;
        int number2 = 0;
        String text = "";
        String value = " ";
        String[] operatorArray = {"+", "-", "*", "/", "x2", "sqrt", "1/x", "switchsign", "Sine",
                "Cosine", "Tangent","Inverse", "Inverse Sine", "Inverse Cosine","Inverse Tangent"};
        List<String> operatorList = Arrays.asList(operatorArray);
        String operation = JOptionPane.showInputDialog("Choose the operator: +, -, *, /, x2, sqrt, 1/x, switchsign, Sine, Cosine, Tangent,Inverse Inverse Sine, Inverse Cosine,Inverse Tangent");
        JOptionPane.showMessageDialog(null, "Operator : "+ operation);

            //JFrame jFrame = new JFrame(); // to create a frame
            number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
            JOptionPane.showMessageDialog(null, "Number : " + number1);
            if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
                number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another number"));
                JOptionPane.showMessageDialog(null, "Number : " + number2);
                res = calc.performBinaryOperation(number1, number2, operation);
            } else {
                res = calc.performUnaryOperation(number1, operation);

//        int number1 = 0;
//        int number2 = 0;
//        String text = "";
//        String value = " ";
//        String[] operatorArray = {"+", "-", "*", "/", "x2", "√", "1/x", "switchsign", "Sine",
//                "Cosine", "Tangent","Inverse", "Inverse Sine", "Inverse Cosine","Inverse Tangent"};
//        String operator = JOptionPane.showInputDialog("Choose the operator: +, -, *, /, x2, √, 1/x, switchsign, Sine, Cosine, Tangent,Inverse Inverse Sine, Inverse Cosine,Inverse Tangent");
//        JOptionPane.showMessageDialog(null, "Operator : "+ operator);
//
//        //JFrame jFrame = new JFrame(); // to create a frame
//        number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
//        JOptionPane.showMessageDialog(null, "Number : "+number1);
//        if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
//            number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another number"));
//            JOptionPane.showMessageDialog(null, "Number : " + number2);
//        }
//
//
//        switch (operator) {
//            case "+" :
//                //int res = Console.(number1, number2);
//                //JOptionPane.showMessageDialog(null, "The result of \"-\" is : " + res);
//                break;
//            case "-" :
//                //int res = ;
//                JOptionPane.showMessageDialog(null, "The result of \"-\" is : " + Console.subtract(number1, number2));
//                break;
//            case "*":
//                //int res = Console.square(number1);
//                //JOptionPane.showMessageDialog(null, "The result of \"\" is : " + mulitply(number1));
//                //break;
//            case "x2":
//                int res = Console.square(number1);
//                JOptionPane.showMessageDialog(null, "The result of \"x2\" is : " + Console.square(number1));
//                break;
//            case "√":
//                //int res = Console.square(number1);
//                JOptionPane.showMessageDialog(null, "The result of \"√\" is : " + Console.squareRoot(number1));
//                break;
//            case "1/x":
//                //int res = Console.square(number1);
//                JOptionPane.showMessageDialog(null, "The result of \"1/x\" is : " + Console.inverse(number1));
//                break;
//            case "switchSign":
//                //int res = Console.square(number1);
//                JOptionPane.showMessageDialog(null, "The result of \"switchsign\" is : " + Console.switchSign(number1));
//                break;
//            case "inverseSine":
//                //int res = Console.square(number1);
//                JOptionPane.showMessageDialog(null, "The result of \"inversesine\" is : " + Console.inverseSine(number1));
//                break;
//            case "inverseCosine":
//                //int res = Console.square(number1);
//                JOptionPane.showMessageDialog(null, "The result of \"inversecosine\" is : " + Console.inverseCosine(number1));
//                break;
//            case "inverseTangent":
//                //int res = Console.square(number1);
//                JOptionPane.showMessageDialog(null, "The result of \"inversetangent\" is : " + Console.inverseTangent(number1));
//                break;
//            case "factorial":
//                //int res = Console.square(number1);
//                JOptionPane.showMessageDialog(null, "The result of \"factorial\" is : " + Console.factorial(number1));
//                break;
//            //case "":
//                //int res = Console.square(number1);
//              //  JOptionPane.showMessageDialog(null, "The result of \"\" is : " + Console.square(number1));
//                //break;
//
//            default :
//                JOptionPane.showMessageDialog(null,"Please select the correct option from the list");
//        }
//
//
//
//        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");



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

            JOptionPane.showMessageDialog(null, res);


//        switch (operator) {
//            case "+" :
//                //int res = Console.(number1, number2);
//                //JOptionPane.showMessageDialog(null, "The result of \"-\" is : " + res);
//                break;
//            case "-" :
//                //int res = ;
//                JOptionPane.showMessageDialog(null, "The result of \"-\" is : " + Console.subtract(number1, number2));
//                break;
//            case "*":
//                //int res = Console.square(number1);
//                //JOptionPane.showMessageDialog(null, "The result of \"\" is : " + mulitply(number1));
//                //break;
//            case "x2":
//                int res = Console.square(number1);
//                JOptionPane.showMessageDialog(null, "The result of \"x2\" is : " + Console.square(number1));
//                break;
//            case "√":
//                //int res = Console.square(number1);
//                JOptionPane.showMessageDialog(null, "The result of \"√\" is : " + Console.squareRoot(number1));
//                break;
//            case "1/x":
//                //int res = Console.square(number1);
//                JOptionPane.showMessageDialog(null, "The result of \"1/x\" is : " + Console.inverse(number1));
//                break;
//            case "switchSign":
//                //int res = Console.square(number1);
//                JOptionPane.showMessageDialog(null, "The result of \"switchsign\" is : " + Console.switchSign(number1));
//                break;
//            case "inverseSine":
//                //int res = Console.square(number1);
//                JOptionPane.showMessageDialog(null, "The result of \"inversesine\" is : " + Console.inverseSine(number1));
//                break;
//            case "inverseCosine":
//                //int res = Console.square(number1);
//                JOptionPane.showMessageDialog(null, "The result of \"inversecosine\" is : " + Console.inverseCosine(number1));
//                break;
//            case "inverseTangent":
//                //int res = Console.square(number1);
//                JOptionPane.showMessageDialog(null, "The result of \"inversetangent\" is : " + Console.inverseTangent(number1));
//                break;
//            case "factorial":
//                //int res = Console.square(number1);
//                JOptionPane.showMessageDialog(null, "The result of \"factorial\" is : " + Console.factorial(number1));
//                break;
//            //case "":
//                //int res = Console.square(number1);
//              //  JOptionPane.showMessageDialog(null, "The result of \"\" is : " + Console.square(number1));
//                //break;
//
//            default :
//                JOptionPane.showMessageDialog(null,"Please select the correct option from the list");
//        }


            Console.println("Welcome to my calculator!");
            String s = Console.getStringInput("Enter a string");
            Integer i = Console.getIntegerInput("Enter an integer");
            Double d = Console.getDoubleInput("Enter a double.");
            RegexParser regexParser = new RegexParser();
            Calculator calculator = new Calculator();
            CalculatorState calculatorState = new CalculatorState();


            Console.println("Welcome to the Demoiselle Calculator!");
            loop:
            while (true) {
                double currentNumber = calculatorState.getCurrentValue();
                String input = Console.getStringInput("");
                double result = 0;


                Console.println("The result of square is : " + Console.square(i));
                Console.println("The result of square root is : " + Console.squareRoot(i));
                Console.println("The result of Inverse is : " + Console.inverse(i));
                Console.println("The result of switch sign is : " + Console.switchSign(i));

                // Are we ready ??
                String num1 = regexParser.extractNumber(input);
                String operator = regexParser.extractOperator(input);
                String num2 = regexParser.extractNumber(input.substring(num1.length() + operator.length()).trim());

                if (num2 == null) {
                    result = calculator.performUnaryOperation(Double.parseDouble(num1), operator);
                } else {
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

