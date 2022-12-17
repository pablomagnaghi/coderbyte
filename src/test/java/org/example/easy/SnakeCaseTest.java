package org.example.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SnakeCaseTest {
    @Test
    public void snakeCase() {
        assertEquals(SnakeCase.snakeCase("Revolt is the right of the people"), "revolt_is_the_right_of_the_people");
        assertEquals(SnakeCase.snakeCase("Fortitude is the guard and support of the other virtues"), "fortitude_is_the_guard_and_support_of_the_other_virtues");
    }
}
