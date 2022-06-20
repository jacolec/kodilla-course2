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
        for (int n=0; n < number; n++) {
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
        when(statisticsMock.usersNames()).thenReturn(testUsers1);
        when(statisticsMock.postsCount()).thenReturn(posts1);
        when(statisticsMock.commentsCount()).thenReturn(comments1);
        StatsCount statsCount = new StatsCount(statisticsMock);
        //When
        statsCount.calculateAdvStatistics(statisticsMock);
        double avPostUser1 = statsCount.getAveragePost();
        double avCommUser1 = statsCount.getAverageComment();
        double avCommPost1 = statsCount.getAverageCommPost();
        //Then
        Assertions.assertEquals(0, avPostUser1);
        Assertions.assertEquals(0.4, avCommUser1);
        Assertions.assertEquals(0, avCommPost1);
    }

    @Test
    void oneThousandPostsTest() {
        //Given
        List<String> testUsers2 = listOfNUsers(10);
        int users2 = 10;
        int posts2 = 1000;
        int comments2 = 4;
        when(statisticsMock.usersNames()).thenReturn(testUsers2);
        when(statisticsMock.postsCount()).thenReturn(posts2);
        when(statisticsMock.commentsCount()).thenReturn(comments2);
        StatsCount statsCount = new StatsCount(statisticsMock);
        //When
        statsCount.calculateAdvStatistics(statisticsMock);
        double avPostUser2 = statsCount.getAveragePost();
        double avCommUser2 = statsCount.getAverageComment();
        double avCommPost2 = statsCount.getAverageCommPost();
        //Then
        Assertions.assertEquals(100, avPostUser2);
        Assertions.assertEquals(0.4, avCommUser2);
        Assertions.assertEquals(0.004, avCommPost2);
    }

    @Test
    void zeroCommentsTest() {
        //Given
        List<String> testUsers3 = listOfNUsers(10);
        int users3 = 10;
        int posts3 = 2;
        int comments3 = 0;
        when(statisticsMock.usersNames()).thenReturn(testUsers3);
        when(statisticsMock.postsCount()).thenReturn(posts3);
        when(statisticsMock.commentsCount()).thenReturn(comments3);
        StatsCount statsCount = new StatsCount(statisticsMock);
        //When
        statsCount.calculateAdvStatistics(statisticsMock);
        double avPostUser3 = statsCount.getAveragePost();
        double avCommUser3 = statsCount.getAverageComment();
        double avCommPost3 = statsCount.getAverageCommPost();
        //Then
        Assertions.assertEquals(0.2, avPostUser3);
        Assertions.assertEquals(0, avCommUser3);
        Assertions.assertEquals(0, avCommPost3);
    }

    @Test
    void moreCommentsThanPostsTest() {
        //Given
        List<String> testUsers4 = listOfNUsers(10);
        int users4 = 10;
        int posts4 = 20;
        int comments4 = 40;
        when(statisticsMock.usersNames()).thenReturn(testUsers4);
        when(statisticsMock.postsCount()).thenReturn(posts4);
        when(statisticsMock.commentsCount()).thenReturn(comments4);
        StatsCount statsCount = new StatsCount(statisticsMock);
        //When
        statsCount.calculateAdvStatistics(statisticsMock);
        double avPostUser4 = statsCount.getAveragePost();
        double avCommUser4 = statsCount.getAverageComment();
        double avCommPost4 = statsCount.getAverageCommPost();
        //Then
        Assertions.assertEquals(2, avPostUser4);
        Assertions.assertEquals(4, avCommUser4);
        Assertions.assertEquals(2, avCommPost4);
    }

    @Test
    void morePostsThanCommentsTest() {
        //Given
        List<String> testUsers5 = listOfNUsers(10);
        int users5 = 10;
        int posts5 = 40;
        int comments5 = 20;
        when(statisticsMock.usersNames()).thenReturn(testUsers5);
        when(statisticsMock.postsCount()).thenReturn(posts5);
        when(statisticsMock.commentsCount()).thenReturn(comments5);
        StatsCount statsCount = new StatsCount(statisticsMock);
        //When
        statsCount.calculateAdvStatistics(statisticsMock);
        double avPostUser5 = statsCount.getAveragePost();
        double avCommUser5 = statsCount.getAverageComment();
        double avCommPost5 = statsCount.getAverageCommPost();
        //Then
        Assertions.assertEquals(4, avPostUser5);
        Assertions.assertEquals(2, avCommUser5);
        Assertions.assertEquals(0.5, avCommPost5);
    }

    @Test
    void zeroUsersTest() {
        //Given
        List<String> testUsers6 = listOfNUsers(0);
        int users6 = 0;
        int posts6 = 30;
        int comments6 = 90;
        when(statisticsMock.usersNames()).thenReturn(testUsers6);
        when(statisticsMock.postsCount()).thenReturn(posts6);
        when(statisticsMock.commentsCount()).thenReturn(comments6);
        StatsCount statsCount = new StatsCount(statisticsMock);
        //When
        statsCount.calculateAdvStatistics(statisticsMock);
        double avPostUser6 = statsCount.getAveragePost();
        double avCommUser6 = statsCount.getAverageComment();
        double avCommPost6 = statsCount.getAverageCommPost();
        //Then
        Assertions.assertEquals(0, avPostUser6);
        Assertions.assertEquals(0, avCommUser6);
        Assertions.assertEquals(3, avCommPost6);
    }

    @Test
    void oneHundredUsersTest() {
        //Given
        List<String> testUsers7 = listOfNUsers(100);
        int users7 = 100;
        int posts7 = 40;
        int comments7 = 80;
        when(statisticsMock.usersNames()).thenReturn(testUsers7);
        when(statisticsMock.postsCount()).thenReturn(posts7);
        when(statisticsMock.commentsCount()).thenReturn(comments7);
        StatsCount statsCount = new StatsCount(statisticsMock);
        //When
        statsCount.calculateAdvStatistics(statisticsMock);
        double avPostUser7 = statsCount.getAveragePost();
        double avCommUser7 = statsCount.getAverageComment();
        double avCommPost7 = statsCount.getAverageCommPost();
        //Then
        Assertions.assertEquals(0.4, avPostUser7);
        Assertions.assertEquals(0.8, avCommUser7);
        Assertions.assertEquals(2, avCommPost7);
    }
}
