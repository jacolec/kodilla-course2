package com.kodilla.testing.forum.statistics;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    private List<String> listOfNUsers(int number) {
        List<String> tempUserList = new ArrayList<>();
        for (int n=1; n < number; n++) {
            String newUser = new String ("user"+n);
            tempUserList.add(newUser);
        } return tempUserList;
    }
    @Test
    void StatsCountTest() {
        //Given
        StatsCount statsCount = new StatsCount(statisticsMock);
        List<String> testUsers1 = listOfNUsers(10);
      //  when(statisticsMock.calculateAdvStatistics());

    }



}
