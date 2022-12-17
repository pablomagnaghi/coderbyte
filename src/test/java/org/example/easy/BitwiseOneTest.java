package org.example.easy;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BitwiseOneTest {

    @Test
    public void bitwiseOne() {
        assertEquals(BitwiseOne.bitwiseOne(new String[]{"001110", "100000"}), "101110");
        assertEquals(BitwiseOne.bitwiseOne(new String[]{"110001", "111100"}), "111101");
    }
}
