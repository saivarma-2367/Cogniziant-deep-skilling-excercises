package com.example;
import org.junit.Test;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(2)
    public void testB() {
        System.out.println("Test B");
    }

    @Test
    @Order(1)
    public void testA() {
        System.out.println("Test A");
    }

    @Test
    @Order(3)
    public void testC() {
        System.out.println("Test C");
    }
}

