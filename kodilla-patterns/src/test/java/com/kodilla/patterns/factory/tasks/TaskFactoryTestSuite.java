package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskFactoryTestSuite {

    @Test
    void testIsTaskExecuted() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.doTask(TaskFactory.SHOP);
        //Then
        Assertions.assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    void testExecuteTask() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.doTask(TaskFactory.PAINT);
        //Then
        Assertions.assertEquals("Starting to create a painting", painting.executeTask());
    }

    @Test
    void testGetTaskName() {
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.doTask(TaskFactory.DRIVE);
        //Then
        Assertions.assertEquals("Drive", driving.getTaskName());
    }
}
