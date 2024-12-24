## Первый тест!

На основе примеров из предыдущего шага напишите тест для следующего метода:
```java
public int sum(int a, int b) {
    if (Integer.MAX_VALUE - a < b) {
        throw new ArithmeticException(); // переполнение типа
    }
    return a + b;
}
```