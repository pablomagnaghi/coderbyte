package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ExOhTest {
    @Test
    public void exOh() {
        assertTrue(ExOh.exOh("xxxooo"));
        assertFalse(ExOh.exOh("xxxoo"));
    }
}
