package com.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorParameterizedTest {
    @ParameterizedTest
    @CsvSource({
            "1,2,3",
            "3,4,7",
            "10,5,15"
    })
    void testAdd(int a, int b, int expected) {
        CalculatorService service = new CalculatorService();
        assertEquals(expected, service.add(a, b));
    }
}

