package org.example.medium;


import org.junit.Test;

import static org.junit.Assert.*;

public class PrimesTest {

    @Test
    public void primes() {
        assertFalse(Primes.primes(195));
        assertTrue(Primes.primes(197));
    }
}
