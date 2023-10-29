package com.zipcodewilmington.scientificcalculator;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;
        String text = "";
        String value = " ";
        String[] operatorArray = {"+", "-", "*", "/", "x2", "√", "1/x", "switchsign", "Sine",
                "Cosine", "Tangent","Inverse", "Inverse Sine", "Inverse Cosine","Inverse Tangent"};
        String operator = JOptionPane.showInputDialog("Choose the operator: +, -, *, /, x2, √, 1/x, switchsign, Sine, Cosine, Tangent,Inverse Inverse Sine, Inverse Cosine,Inverse Tangent");
        JOptionPane.showMessageDialog(null, "Operator : "+ operator);

        //JFrame jFrame = new JFrame(); // to create a frame
        number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        JOptionPane.showMessageDialog(null, "Number : "+number1);
        if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
            number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter another number"));
            JOptionPane.showMessageDialog(null, "Number : " + number2);
        }


        switch (operator) {
            case "+" :
                //int res = Console.(number1, number2);
                //JOptionPane.showMessageDialog(null, "The result of \"-\" is : " + res);
                break;
            case "-" :
                //int res = ;
                JOptionPane.showMessageDialog(null, "The result of \"-\" is : " + Console.subtract(number1, number2));
                break;
            case "*":
                //int res = Console.square(number1);
                //JOptionPane.showMessageDialog(null, "The result of \"\" is : " + mulitply(number1));
                //break;
            case "x2":
                int res = Console.square(number1);
                JOptionPane.showMessageDialog(null, "The result of \"x2\" is : " + Console.square(number1));
                break;
            case "√":
                //int res = Console.square(number1);
                JOptionPane.showMessageDialog(null, "The result of \"√\" is : " + Console.squareRoot(number1));
                break;
            case "1/x":
                //int res = Console.square(number1);
                JOptionPane.showMessageDialog(null, "The result of \"1/x\" is : " + Console.inverse(number1));
                break;
            case "switchSign":
                //int res = Console.square(number1);
                JOptionPane.showMessageDialog(null, "The result of \"switchsign\" is : " + Console.switchSign(number1));
                break;
            case "inverseSine":
                //int res = Console.square(number1);
                JOptionPane.showMessageDialog(null, "The result of \"inversesine\" is : " + Console.inverseSine(number1));
                break;
            case "inverseCosine":
                //int res = Console.square(number1);
                JOptionPane.showMessageDialog(null, "The result of \"inversecosine\" is : " + Console.inverseCosine(number1));
                break;
            case "inverseTangent":
                //int res = Console.square(number1);
                JOptionPane.showMessageDialog(null, "The result of \"inversetangent\" is : " + Console.inverseTangent(number1));
                break;
            case "factorial":
                //int res = Console.square(number1);
                JOptionPane.showMessageDialog(null, "The result of \"factorial\" is : " + Console.factorial(number1));
                break;
            //case "":
                //int res = Console.square(number1);
              //  JOptionPane.showMessageDialog(null, "The result of \"\" is : " + Console.square(number1));
                //break;

            default :
                JOptionPane.showMessageDialog(null,"Please select the correct option from the list");
        }



        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);


        Console.println("The result of square is : "  + Console.square(i));
        Console.println("The result of square root is : " + Console.squareRoot(i));
        Console.println("The result of Inverse is : " + Console.inverse(i));
        Console.println("The result of switch sign is : " + Console.switchSign(i));

        // Are we ready ??
    }

}
