package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

// AB

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
    public static int square(int number) {
        return number * number;
    }
    public static double squareRoot(int number){
        return Math.sqrt(number);
    }

    public static double inverse(double number) {
        return 1 / number;
    }

    public static int switchSign(int number) {
        return -1 * number ;
    }

    public static int subtract(int number1, int number2) {
        return number1 - number2;
    }


    // TEVIN'S METHODS

}
