package com.example;

import junit.framework.TestCase;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest extends TestCase {
    @Test
    public void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }
    @Test
    public void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.subtract(3, 2));
    }
}