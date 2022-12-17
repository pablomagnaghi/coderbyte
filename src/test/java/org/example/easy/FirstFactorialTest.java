package org.example.easy;


import org.junit.Test;

import static org.junit.Assert.*;

public class FirstFactorialTest {
    @Test
    public void firstFactorial() {
        assertEquals(FirstFactorial.firstFactorial(4), 24);
        assertEquals(FirstFactorial.firstFactorial(8), 40320);
    }
}
