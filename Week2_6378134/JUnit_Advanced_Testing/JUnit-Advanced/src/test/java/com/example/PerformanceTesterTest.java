package com.example;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

class PerformanceTesterTest {
    @Test
    void testPerformance() {
        PerformanceTester tester = new PerformanceTester();
        assertTimeout(Duration.ofMillis(500), () -> {
            tester.performTask();
        });
    }
}