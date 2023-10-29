package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userStrInput = scanner.nextLine();
        return userStrInput;
    }


    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        int userIntInput = scanner.nextInt();
        return userIntInput;
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        double userDoubleInput = (int) scanner.nextDouble();
        return userDoubleInput;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double square(double a) {
        return a * a;
    }

    public static double squareRoot(double a){
        return Math.sqrt(a);
    }

    public static double inverse(double a) {
        return 1 / a;
    }

    public static double switchSign(double a) {
        return -1 * a ;

    }
}
