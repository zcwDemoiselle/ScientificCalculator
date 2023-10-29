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

    public static double inverseSine(double number) {
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
        if (number == 0) {
            return 1;
        }
        else if (number < 0) {
            number++;
            while (number < 0) {
                answer *= number;
                number++;
            }
        }
        else {
            number--;
            while (number > 0) {
                answer *= number;
                number--;
            }
        }
        return answer;
    }

    public static void showHelp() {
        println("Welcome to the Scientific Calculator!");
        println("Usage: Enter your mathematical expression and press Enter.");
        println("Supported Operations:");
        println("- Basic Arithmetic: +, -, *, /, %");
        println("- Power: ^");
        println("- Square Root: sqrt(number)");
        println("- Logarithm: log(base, number)");
        println("- Factorial: !(number)");
        println("- Trigonometric Functions: sin(number), cos(number), tan(number)");
        println("Example: 2 + sqrt(16) * log(2, 8)");
        }

    }

    // GOWRI'S METHODS

    // TEVIN'S METHODS

}
