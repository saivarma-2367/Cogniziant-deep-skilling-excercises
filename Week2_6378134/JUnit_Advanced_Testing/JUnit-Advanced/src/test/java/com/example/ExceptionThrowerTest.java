package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionThrowerTest {
    @Test
    void testExceptionThrown() {
        ExceptionThrower thrower = new ExceptionThrower();
        assertThrows(IllegalArgumentException.class, thrower::throwException);
    }
}