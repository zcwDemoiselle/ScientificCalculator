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
        String userInput = scanner.nextLine();
        return userInput;
    }

    // This method and the one below it share the exact same logic as the method above, just with different data types
    public static Integer getIntegerInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        int userInput = scanner.nextInt();
        return userInput;
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        double userInput = scanner.nextDouble();
        return userInput;
    }

    // LOUIE'S METHODS

    public static int multiplication(int number1, int number2) {
        return number1 * number2;
    }

    public static int inverseSine(int number) {
        return number;
    }

    public static int inverseCosine(int number) {
        return number;
    }

    public static int inverseTangent(int number) {
        return number;
    }

    public static int factorial(int number) {
        int answer = number;
        number--;
        while (number > 0) {
            answer *= number;
            System.out.println(answer);
            System.out.println(number);
            number--;
        }
        return answer;
    }

    // GOWRI'S METHODS

    // TEVIN'S METHODS

}
