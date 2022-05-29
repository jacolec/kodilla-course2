package com.kodilla.testing.forum.statistics;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

public class ForumStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    @Test
    void StatsCountTest() {
        //Given
        StatsCount statsCount = new StatsCount(statisticsMock);
        List<String> testUserNames = new ArrayList<>();
        testUserNames.add("User1");


    }



}
