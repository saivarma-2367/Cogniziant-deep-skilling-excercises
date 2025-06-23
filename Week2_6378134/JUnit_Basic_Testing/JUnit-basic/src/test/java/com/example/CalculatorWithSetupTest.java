package com.example;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorWithSetupTest {
    private Calculator calculator;
    @Before
    public void setUp() {
        System.out.println("Setting up test...");
        calculator = new Calculator(); // Arrange
    }
    @After
    public void tearDown() {
        System.out.println("Cleaning up after test...");
        calculator = null;
    }
    @Test
    public void testAdd() {
        int result = calculator.add(4, 5);
        assertEquals(9, result);
    }
    @Test
    public void testSubtract() {
        int result = calculator.subtract(10, 4);
        assertEquals(6, result);
    }
}
