package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {

        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);

<<<<<<< HEAD
        Console.println("The result of subtracting " + d + " from " + i + " is : " + Console.subtract(i, d));
        Console.println("The result of square is : "  + Console.square(i));
        Console.println("The result of square root is : " + Console.squareRoot(i));
        Console.println("The result of Inverse is : " + Console.inverse(i));
        Console.println("The result of switch sign is : " + Console.switchSign(i));

        // Are we ready ??
=======
>>>>>>> 58913c8ed85d501b988349c55e0b36de8c06717b
    }

}
