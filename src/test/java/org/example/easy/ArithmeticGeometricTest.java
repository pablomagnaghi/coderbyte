package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArithmeticGeometricTest {

    @Test
    public void arithmeticGeometric() {
        assertEquals(ArithmeticGeometric.arithmeticGeometric(new int[]{2, 4, 6, 8}), "Arithmetic");
        assertEquals(ArithmeticGeometric.arithmeticGeometric(new int[]{2, 6, 18, 54}), "Geometric");
        assertEquals(ArithmeticGeometric.arithmeticGeometric(new int[]{-3, -4, -5, -6, -7}), "Arithmetic");
    }
}
