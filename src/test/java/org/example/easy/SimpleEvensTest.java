package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleEvensTest {

    @Test
    public void simpleEvens() {
        assertFalse(SimpleEvens.simpleEvens(222252));
        assertTrue(SimpleEvens.simpleEvens(228));
    }
}
