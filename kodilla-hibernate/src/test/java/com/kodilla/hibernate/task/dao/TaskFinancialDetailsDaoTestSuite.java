package com.kodilla.hibernate.task.dao;


import com.kodilla.hibernate.task.TaskFinancialDetails;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.math.BigDecimal;
import java.util.List;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class TaskFinancialDetailsDaoTestSuite {

    @Autowired
    private TaskFinancialDetailsDao taskFinancialDetailsDao;

    @Test
    void testFindByPaid() {
        //given
        TaskFinancialDetails taskFinancialDetails = new TaskFinancialDetails(
                new BigDecimal(115), false);
        taskFinancialDetailsDao.save(taskFinancialDetails);
        int id = taskFinancialDetails.getId();
        //when
        List<TaskFinancialDetails> resultList = taskFinancialDetailsDao.findByPaid(false);
        //then
        Assertions.assertEquals(1, resultList.size());
        //cleanUp
        taskFinancialDetailsDao.deleteById(id);
    }


}
