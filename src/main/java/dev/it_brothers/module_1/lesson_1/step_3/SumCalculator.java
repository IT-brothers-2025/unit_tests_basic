package dev.it_brothers.module_1.lesson_1.step_3;

public class SumCalculator {

    public int sum(int a, int b) {
        if (Integer.MAX_VALUE - a < b) {
            throw new ArithmeticException(); // переполнение типа
        }
        return a + b;
    }
}
