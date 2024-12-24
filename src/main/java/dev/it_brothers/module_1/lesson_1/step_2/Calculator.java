package dev.it_brothers.module_1.lesson_1.step_2;

public class Calculator {
    public double calculateTax(double price) {
        return price * 0.1; // Ошибка! Нужно умножать на 0.15.
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException();
        }
        return a / b;
    }
}
