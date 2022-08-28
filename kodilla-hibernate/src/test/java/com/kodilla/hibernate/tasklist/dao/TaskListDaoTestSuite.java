package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "List number 1";
    private static final String DESCRIPTION = "List of tasks: Hibernate";

    @Test
    void testFindByListName() {
        //given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        String tempListName = taskList.getListName();
        //when
        List<TaskList> tempList = taskListDao.findByListName(tempListName);
        //then
        Assertions.assertEquals(tempListName, tempList.get(0).getListName());
        //cleanUp
        int id = tempList.get(0).getId();
        taskListDao.deleteById(id);

    }
}
