package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BitwiseTwoTest {

    @Test
    public void bitwiseTwo() {
        assertEquals(BitwiseTwo.bitwiseTwo(new String[]{"001110", "100000"}), "000000");
        assertEquals(BitwiseTwo.bitwiseTwo(new String[]{"110001", "111100"}), "110000");
    }
}
