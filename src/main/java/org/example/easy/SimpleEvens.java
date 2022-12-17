package org.example.easy;

/**
 * Have the function simpleEvens(num) check whether
 * every single number in passed in parameter is even.
 * If so, return the string true, otherwise return the string false.
 * For example: if num is 4602225 your program should
 * return the string false because 5 is not an even number.
 */
public class SimpleEvens {

    public static boolean simpleEvens(Integer num) {
        String[] digits = num.toString().split("");
        for (String digit : digits) {
            if (Integer.parseInt(digit) % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
