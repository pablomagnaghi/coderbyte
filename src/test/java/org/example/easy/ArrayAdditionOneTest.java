package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayAdditionOneTest {

    @Test
    public void arrayAdditionOne() {
        assertTrue(ArrayAdditionOne.arrayAdditionOne(new int[]{4, 6, 23, 10, 1, 3}));
        assertFalse(ArrayAdditionOne.arrayAdditionOne(new int[]{2, 6, 18}));
    }
}
