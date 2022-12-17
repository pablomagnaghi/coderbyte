package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SimpleSymbolsTest {

    @Test
    public void simpleSymbols() {
        assertTrue(SimpleSymbols.simpleSymbols("=+e++r+f+v+"));
        assertFalse(SimpleSymbols.simpleSymbols("=+e++r+ff+v+"));
    }

    @Test
    public void simpleSymbolsWithPatternMatcher() {
        assertTrue(SimpleSymbols.simpleSymbolsWithPatternMatcher("=+e++r+f+v+"));
        assertFalse(SimpleSymbols.simpleSymbolsWithPatternMatcher("=+e++r+ff+v+"));
    }
}
