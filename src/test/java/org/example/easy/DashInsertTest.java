package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DashInsertTest {
    @Test
    public void dashInsert() {
        assertEquals(DashInsert.dashInsert("454793"), "4547-9-3");
        assertEquals(DashInsert.dashInsert("25928"), "25-928");
    }
}
