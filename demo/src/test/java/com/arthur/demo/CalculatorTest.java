package com.arthur.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @Test
    public void sumTwoNumbers() {
        calculator = new Calculator();
        int result = calculator.evaluate("2+1");
        Assertions.assertEquals(3, result);
    }
}