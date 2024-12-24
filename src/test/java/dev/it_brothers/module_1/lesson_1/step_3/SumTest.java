package dev.it_brothers.module_1.lesson_1.step_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SumTest {

    @Test
    public void testSum() {
        SumCalculator calculator = new SumCalculator();
        assertEquals(15, calculator.sum(10, 5));
        assertThrows(ArithmeticException.class, () -> calculator.sum(Integer.MAX_VALUE, 2));
    }
}
