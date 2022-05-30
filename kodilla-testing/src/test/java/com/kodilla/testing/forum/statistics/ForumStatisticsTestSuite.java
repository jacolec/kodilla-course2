package com.kodilla.testing.forum.statistics;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Assertions;
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
    void zeroPostsTest() {
        //Given
        List<String> testUsers1 = listOfNUsers(10);
        int users1 = 10;
        int posts1 = 0;
        int comments1 = 4; //impossible when no posts
        double avPostUser1 = posts1 / users1;
        double avCommUser1 = comments1 / users1;
        double avCommPost1 = comments1 / posts1;
        when(statisticsMock.usersNames()).thenReturn(testUsers1);
        when(statisticsMock.postsCount()).thenReturn(posts1);
        when(statisticsMock.commentsCount()).thenReturn(comments1);
        StatsCount statsCount = new StatsCount(statisticsMock);
        //When
        List<String> tempUserList1 = statsCount.userNameList(testUsers1);
        int




        //Then



    }



}
