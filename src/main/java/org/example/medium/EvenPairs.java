package org.example.medium;

/**
 * Have the function evenPairs(str) take the str parameter being passed
 * and determine if a pair of adjacent even numbers exists anywhere
 * in the string. If a pair exists, return the string true,
 * otherwise return false.
 * ---
 * For example: if str is "f178svg3k19k46"
 * then there are two even numbers at the end of the string, "46"
 * so your program should return the string true.
 * ---
 * Another example: if str is "7r5gg812" then the pair is "812" (8 and 12)
 * so your program should return the string true.
 */
public class EvenPairs {
    private static String[] splitNumbers(String str) {
        return str
                .toLowerCase()
                .replaceAll("([^0-9])", " ")
                .replaceAll(" +", " ")
                .trim().split(" ");
    }

    private static int addFollowingZeroes(int digits) {
        int result = 1;
        if (digits == 1) {
            return result;
        }
        for (int i = 0; i < digits; i++) {
            result *= 10;
        }
        return result;
    }

    private static boolean isEvenPair(Integer num) {
        // get a number of digits
        int len = (int) (Math.log10(num) + 1);
        for (int i = len - 1; i > 0; i--) {
            int num1 = num / addFollowingZeroes(i);
            int num2 = num - num1;
            if (num1 % 2 == 0 && num2 % 2 == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean evenPairs(String str) {
        String[] coll = splitNumbers(str);
        for (String item : coll) {
            if (item.length() > 1 && isEvenPair(Integer.parseInt(item))) {
                return true;
            }
        }
        return false;
    }
}
