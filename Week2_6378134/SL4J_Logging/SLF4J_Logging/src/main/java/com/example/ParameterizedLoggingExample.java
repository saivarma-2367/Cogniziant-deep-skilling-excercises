package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String userName = "Sai";
        int age = 25;

        logger.info("User {} has logged in.", userName);
        logger.debug("User {} is {} years old.", userName, age);
    }
}
