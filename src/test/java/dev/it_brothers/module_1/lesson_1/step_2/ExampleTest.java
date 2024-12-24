package dev.it_brothers.module_1.lesson_1.step_2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExampleTest {

    @Test
    public void testCalculateTax() {
        Calculator calculator = new Calculator();
        double tax = calculator.calculateTax(100);
        assertEquals(15.0, tax, 0.01); // Ожидаем 15, но функция возвращает 10.
    }

    @Test
    public void testSort() {
        List<Integer> numbers = Arrays.asList(3, 1, 2);
        Collections.sort(numbers);
        assertEquals(Arrays.asList(1, 2, 3), numbers);
    }

    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        assertEquals(2, calculator.divide(10, 5), 0.001); // Деление 10 на 5 дает 2
        assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0)); // Деление на 0 вызывает исключение
    }
}
