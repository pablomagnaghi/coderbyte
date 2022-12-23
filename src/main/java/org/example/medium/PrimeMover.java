package org.example.medium;

/**
 * Have the function primeMover(num) return the num th prime number.
 * The range will be from 1 to 10^4.
 * ---
 * For example: if num is 16 the output should be 53 as 53 is the 16th prime number.
 */
public class PrimeMover {

    private static boolean isPrimeNumber(int num) {
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

    public static int primeMover(int num) {
        int i = 1;
        int primes = 0;
        while (primes < num) {
            if (isPrimeNumber(i)) {
                primes++;
            }
            i++;
        }
        return i - 1;
    }
}
