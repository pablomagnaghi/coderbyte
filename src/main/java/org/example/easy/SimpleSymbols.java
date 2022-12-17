package org.example.easy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Have the function SimpleSymbols(str) take the str parameter being passed
 * and determine if it is an acceptable sequence by
 * either returning the string true or false.
 * The str parameter will be composed of + and = symbols
 * with several characters between them (i.e. ++d+===+c++==a)
 * and for the string to be true each letter must be surrounded
 * by a + symbol. So the string to the left would be false.
 * The string will not be empty and will have at least one letter.
 */
public class SimpleSymbols {

    public static boolean simpleSymbols(String str) {
        if (Character.isLetter(str.charAt(0))) {
            return false;
        }
        if (Character.isLetter(str.charAt(str.length() - 1))) {
            return false;
        }

        for (int i = 1; i < str.length() - 1; i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (str.charAt(i - 1) != '+' || str.charAt(i + 1) != '+') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean simpleSymbolsWithPatternMatcher(String str) {
        Pattern pattern1 = Pattern.compile("(?=(\\+\\w\\+))");
        Pattern pattern2 = Pattern.compile("[a-z]");
        Matcher matcher1 = pattern1.matcher(str);
        Matcher matcher2 = pattern2.matcher(str);
        int count1 = 0;
        int count2 = 0;
        int i1 = 0;
        int i2 = 0;
        while (matcher1.find(i1)) {
            count1++;
            i1 = matcher1.start() + 1;
        }
        while (matcher2.find(i2)) {
            count2++;
            i2 = matcher2.start() + 1;
        }
        return count1 == count2;
    }
}
