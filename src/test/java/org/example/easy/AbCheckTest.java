package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AbCheckTest {

    @Test
    public void abCheck() {
        assertTrue(AbCheck.abCheck("lane borrowed"));
        assertFalse(AbCheck.abCheck("australia"));
    }

    @Test
    public void abCheckPatternMather() {
        assertTrue(AbCheck.abCheckPatternMather("lane borrowed"));
        assertFalse(AbCheck.abCheckPatternMather("australia"));
    }
}
