package org.example.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * Have the function threeFiveMultiples(num) return the sum
 * of all the multiples of 3 and 5 that are below num.
 * For example: if num is 10, the multiples of 3 and 5
 * that are below 10 are 3, 5, 6, and 9,
 * and adding them up you get 23, so your program should return 23.
 * The integer being passed will be between 1 and 100.
 */
public class ThreeFiveMultiples {
    private static final Set<Integer> freq = new HashSet<>();

    private static void countMultiples(int num, int mp) {
        for (int i = mp; i < num; i += mp) {
            if (i % mp == 0) {
                freq.add(i);
            }
        }
    }

    public static int threeFiveMultiples(int num) {
        int total = 0;
        countMultiples(num, 3);
        countMultiples(num, 5);
        for (int i : freq) {
            total += i;
        }
        return total;
    }

}
