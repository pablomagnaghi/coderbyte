package org.example.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimeCheckerTest {

    @Test
    public void primeChecker() {
        assertEquals(PrimeChecker.primeChecker(591521), 1);
        assertEquals(PrimeChecker.primeChecker(910), 1);
    }
}
