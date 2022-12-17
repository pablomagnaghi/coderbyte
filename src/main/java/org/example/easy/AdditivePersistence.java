package org.example.easy;

public class AdditivePersistence {

    /**
     * Have the function additivePersistence(num) take the num parameter being passed
     * which will always be a positive integer
     * and return its additive persistence which is the number of times
     * you must add the digits in num until you reach a single digit.
     * ---
     * For example: if num is 2718 then your program
     * should return 2 because 2 + 7 + 1 + 8 = 18
     * and 1 + 8 = 9, and you stop at 9.
     */

    public static int additivePersistence(int num) {
        int times = 0;
        int added = num;
        while (added > 9) {
            int sum = 0;
            String[] intArr = Integer.toString(added).split("");
            for (String i : intArr) {
                sum += Integer.parseInt(i);
            }
            added = sum;
            times++;
        }
        return times;
    }
}
