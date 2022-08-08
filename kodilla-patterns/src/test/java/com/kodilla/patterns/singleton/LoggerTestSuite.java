package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @Test
    void testGetLastLog() {
        //Given
        Logger logger = Logger.INSTANCE;
        logger.log("LOG_1");
        //When
        String tempLog = "LOG_1";
        String firstLog = logger.getLastLog();
        //Then
        Assertions.assertEquals(tempLog, firstLog);
    }
}
