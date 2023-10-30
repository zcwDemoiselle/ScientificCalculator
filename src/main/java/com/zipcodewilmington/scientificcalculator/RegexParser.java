package com.zipcodewilmington.scientificcalculator;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexParser {
    public static String extractNumber(String input) {
        // Use regex to extract the number from the input
        Pattern numberPattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        Matcher matcher = numberPattern.matcher(input);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    public static String extractOperator(String input) {
        // Use regex to extract the operator from the input
        Pattern operatorPattern = Pattern.compile("[+\\-*/%]|\\^|log\\(|ln\\(|sin\\(|cos\\(|tan\\(|asin\\(|acos\\(|atan\\(|sqrt\\(|!|h|help");
        Matcher matcher = operatorPattern.matcher(input);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

}
