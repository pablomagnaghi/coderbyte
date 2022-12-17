package org.example.easy;

/**
 * Have the function firstReverse(str) take the str parameter
 * being passed and return the string in reversed order.
 * For example: if the input string is "Hello World and Coders"
 * then your program should return the string sredoC dna dlroW olleH.
 */
public class FirstReverse {

    public static String firstReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

}
