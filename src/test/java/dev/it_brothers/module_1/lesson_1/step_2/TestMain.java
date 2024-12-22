package dev.it_brothers.module_1.lesson_1.step_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMain {

    // пример решения
    @Test
    public void testSum() {
        assertEquals(3, Main.sum(1, 2));
    }
}
