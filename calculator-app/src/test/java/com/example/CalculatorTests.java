package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(6, calc.add(2, 2, 2)); // 2+2+2 = 6
    }

    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(1, calc.subtract(3, 2));
    }

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(6, calc.multiply(2, 3));
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        Assertions.assertEquals(2, calc.divide(6, 3));
        Assertions.assertEquals(0, calc.divide(5, 10));
        Assertions.assertEquals(-2, calc.divide(-6, 3));
        Assertions.assertEquals(2, calc.divide(-6, -3));
    }

    @Test
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        Exception exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(5, 0);
        });
        Assertions.assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
