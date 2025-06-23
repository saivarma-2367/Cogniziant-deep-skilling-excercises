package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(AppenderLoggingExample.class);

    public static void main(String[] args) {
        logger.info("This message should appear in both the console and app.log");
        logger.warn("This is a warning written to both appenders");
        logger.error("This is an error message with appenders");
    }
}
