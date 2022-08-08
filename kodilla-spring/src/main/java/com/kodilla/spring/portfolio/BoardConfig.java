package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BoardConfig {

    @Autowired
    Board board;

    @Bean(name = "Board")
    public Board getBoard() {
        return new Board(board.getToDoList(), board.getInProgressList(), board.getDoneList());
    }

   @Bean(name = "toDoList")
    public TaskList addToDoTask() {
       return new TaskList(board.getToDoList().getTasks());
   }

   @Bean(name = "inProgressList")
    public TaskList addInProgressTask() {
       return new TaskList(board.getInProgressList().getTasks());
   }

   @Bean(name = "doneList")
    public TaskList addDoneTask() {
       return new TaskList(board.getDoneList().getTasks());
   }
}
