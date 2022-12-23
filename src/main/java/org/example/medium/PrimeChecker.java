package org.example.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Have the function primeChecker(num) take num and return 1
 * if any arrangement of num comes out to be a prime number, otherwise return 0.
 * For example: if num is 910, the output should be 1
 * because 910 can be arranged into 109 or 019, both of which are primes
 */
public class PrimeChecker {
    /**
     * Collection of permutations.
     * E.g. [5, 9, 1, 2, 1, 5] -> 591521, 591512, 591251, 591215, ...
     */
    private static final List<Integer> permutations = new ArrayList<>();

    private static boolean isPrime(int num) {
        // prime numbers are greater than 1
        if (num <= 1) {
            return false;
        }
        // 2 is an only even prime number
        // http://mathworld.wolfram.com/EvenPrime.html
        if (num == 2) {
            return true;
        }
        // eliminate all even numbers to reduce time complexity
        // (cannot be a prime number if is divisible by 2)
        if (num % 2 == 0) {
            return false;
        }
        // no need to check the entire range from 0 to num
        // (square root of num) + 1 is the sufficient upper limit
        // which greatly reduces time complexity
        double upper = Math.sqrt(num) + 1;
        // since the even numbers are eliminated, we can check the odd numbers only
        for (int i = 3; i < upper; i += 2) {
            if (num % i == 0) {
                // not a prime number
                return false;
            }
        }
        // must be a prime number!
        return true;
    }

    private static void swap(char[] coll, int i, int j) {
        char temp = coll[i];
        coll[i] = coll[j];
        coll[j] = temp;
    }

    private static void getPermutations(char[] coll, int index) {
        if (index == coll.length - 1) {
            permutations.add(Integer.parseInt(String.valueOf(coll)));
        }
        for (int i = index; i < coll.length; i++) {
            swap(coll, index, i);
            getPermutations(coll, index + 1);
            swap(coll, index, i);
        }
    }

    public static int primeChecker(int num) {
        getPermutations(String.valueOf(num).toCharArray(), 0);
        for (int i : permutations) {
            if (isPrime(i)) {
                // prime number is found in permutation
                return 1;
            }
        }
        // permutations do not include a prime number
        return 0;
    }
}
