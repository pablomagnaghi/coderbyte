package org.example.easy;

/**
 * Have the function powersOfTwo(num) take the num parameter being passed
 * which will be an integer and return the string true if it's a power of two.
 * If it's not return the string false.
 * For example if the input is 16 then your program should return the string true
 * but if the input is 22 then the output should be the string false.
 */
public class PowersOfTwo {

    public static boolean powersOfTwo(int num) {
        int bitwise = num & num - 1;
        return num != 0 && bitwise == 0;
    }
}
