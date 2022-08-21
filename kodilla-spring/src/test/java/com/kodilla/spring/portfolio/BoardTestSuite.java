package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().getTasks().add("Something to do...");
        board.getInProgressList().getTasks().add("Something in progress...");
        board.getDoneList().getTasks().add("Done stuff!");

        //Then
        Assertions.assertEquals("Something to do...", board.getToDoList().getTasks().get(0));
        Assertions.assertEquals("Something in progress...", board.getInProgressList().getTasks().get(0));
        Assertions.assertEquals("Done stuff!", board.getDoneList().getTasks().get(0));

        System.out.println(board.getDoneList().getTasks().get(0));
        System.out.println(board.getInProgressList().getTasks().get(0));
        System.out.println(board.getDoneList().getTasks().get(0));
    }
}