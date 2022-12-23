package org.example.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrimeTimeTest {

    @Test
    public void primeTime() {
        assertTrue(PrimeTime.primeTime(199));
        assertTrue(PrimeTime.primeTime(2129));
    }
}
