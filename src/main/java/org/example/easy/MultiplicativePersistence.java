package org.example.easy;

/**
 * Have the function multiplicativePersistence(num) take the num parameter being passed
 * which will always be a positive integer
 * and return its multiplicative persistence which is
 * the number of times you must multiply the digits in num until you reach a single digit.
 * ---
 * For example: if num is 39 then your program
 * should return 3 because 3 * 9 = 27 then 2 * 7 = 14
 * and finally 1 * 4 = 4 then you stop at 4.
 */
public class MultiplicativePersistence {

    public static int multiplicativePersistence(int num) {
        int times = 0;
        int multiplied = num;
        while (multiplied > 9) {
            int product = 1;
            String[] intArr = Integer.toString(multiplied).split("");
            for (String i : intArr) {
                product *= Integer.parseInt(i);
            }
            multiplied = product;
            times++;
        }
        return times;
    }
}
