package org.example.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionTest {
    @Test
    public void division() {
        assertEquals(Division.division(20, 40), 20);
        assertEquals(Division.division(12, 16), 4);
    }
}
