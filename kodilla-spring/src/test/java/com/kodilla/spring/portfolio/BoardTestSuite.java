package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        String toDoTask = "toDoTask";
        String inProgressTask = "inProgressTask";
        String doneTask = "doneTask";
        //When
        TaskList toDoList = new TaskList(board.getToDoList().addTask(toDoTask));
        TaskList inProgressList = new TaskList(board.getInProgressList().addTask(inProgressTask));
        TaskList doneTaskList = new TaskList(board.getDoneList().addTask(doneTask));
        //Then
        Assertions.assertEquals(toDoTask, toDoList.getTasks());
        Assertions.assertEquals(inProgressTask, inProgressList.getTasks());
        Assertions.assertEquals(doneTask, doneTaskList.getTasks());
    }
}
