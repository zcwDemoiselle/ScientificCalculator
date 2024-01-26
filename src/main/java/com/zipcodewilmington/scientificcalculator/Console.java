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

    public static double handleRemainder(double number) {
        double tolerance = 1e-10;
        if (Math.abs(number % 1) < tolerance) {
            int converted = (int) number;
            return converted;
        }
        else {
            return number;
        }
    }

    // LOUIE'S METHODS

    public static double multiplication(double number1, double number2) {
        return number1 * number2;
    }

    public static double inverseSine(double number) {
        if (number >= -1 && number <= 1) {
            return Math.asin(number);
        }
        else {
            throw new IllegalArgumentException("Value must be between -1 and 1");
        }
    }

    public static double inverseCosine(double number) {
        if (number >= -1 && number <= 1) {
            return Math.acos(number);
        }
        else {
            throw new IllegalArgumentException("Value must be between -1 and 1");
        }
    }

    public static double inverseTangent(double number) {
        if (number >= -1 && number <= 1) {
            return Math.atan(number);
        }
        else {
            throw new IllegalArgumentException("Value must be between -1 and 1");
        }
    }

    public static double factorial(double number) {
        double answer = number;
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

    public static double modulus(double number1, double number2) {
        return number1 % number2;
    }


    public static double logarithm(double number) {
        if (number > 0) {
            return Math.log10(number);
        }
        else {
            throw new IllegalArgumentException("Value must be greater than 0");
        }
    }

//    public static double naturalLogarithm(double number) {
//        if (number > 0) {
//            return Math.log(number);
//        }
//        else {
//            throw new IllegalArgumentException("Value must be greater than 0");
//        }
//    }

    public static double inverseLogarithm(double number) {
        if (number > 0) {
            return Math.pow(10, number);
        }
        else {
            throw new IllegalArgumentException("Value must be greater than 0");
        }
    }

//    public static double inverseNaturalLogarithm(double number) {
//        if (number > 0) {
//            return Math.exp(number);
//        }
//        else {
//            throw new IllegalArgumentException("Value must be greater than 0");
//        }
//    }


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
        //println("Natural Logarithm: (");
        //println("- InverseLog: ");
        //println("- InverseNaturalLog: ");
        }

    // GOWRI'S METHODS

    public static double square(double number) {
        return number * number;
    }
    public static double squareRoot(double number){
        if (number > 0) {
            return Math.sqrt(number);
        }
        else {
            throw new IllegalArgumentException("Value must be a positive integer");
        }
    }

    public static double inverse(double number) {
        if (number != 0) {
            return 1/number;
        }else {
            throw new IllegalArgumentException("Value cannot be zero");
        }

    }


    public static double switchSign(double number) {
        return -1 * number ;
    }

    public static double subtraction(double number1, double number2) {
        return number1 - number2;
    }

    public static double logInverse(double number1) {
        return Math.pow(10,number1);
    }
    public static double naturalLogarithm(double number1) {
        if (number1 > 0) {
            return Math.log(number1);
        }
        else {
            throw new IllegalArgumentException("Value must be greater than 0");
        }
    }
    public static double inverseNaturalLogarithm(double number1) {
        if (number1 > 0) {
            return Math.exp(number1);
        }
        else {
            throw new IllegalArgumentException("Value must be greater than 0");
        }
    }
    // TEVIN'S METHODS

    public static double addition(double number1, double number2) {
        return number1 + number2;
    }

    public static double division(double number1, double number2) {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            throw new IllegalArgumentException("Values cant be divided by 0");
        }
    }


    public static double sine(double number1) {
        if (number1 >= -1 && number1 <= 1) {
            return Math.sin(number1);
        }
        else {
            throw new IllegalArgumentException("Value must be between -1 and 1");
        }
    }

    public static double cosine(double number1) {
        if (number1 >= -1 && number1 <= 1) {
            return Math.cos(number1);
        }
        else {
            throw new IllegalArgumentException("Value must be between -1 and 1");
        }
    }

    public static double tangent(double number1) {
        if (number1 >= -1 && number1 <= 1) {
            return Math.tan(number1);
        }
        else {
            throw new IllegalArgumentException("Value must be between -1 and 1");
        }
    }
}
