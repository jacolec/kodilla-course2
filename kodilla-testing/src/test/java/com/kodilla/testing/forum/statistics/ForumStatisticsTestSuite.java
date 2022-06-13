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
        when(statisticsMock.usersNames()).thenReturn(testUsers1);
        when(statisticsMock.postsCount()).thenReturn(posts1);
        when(statisticsMock.commentsCount()).thenReturn(comments1);
        StatsCount statsCount = new StatsCount(statisticsMock);
        //When
        List<String> tempUserList1 = statsCount.userNameList(users1);
        int tempPosts1 = statsCount.numberOfPosts(posts1);
        int tempComments1 = statsCount.numberOfComments(comments1);
        double avPostUser1 = 0; //tempPosts1 / tempUserList1.size();
        double avCommUser1 = tempComments1 / tempUserList1.size();
        double avCommPost1 = 0;
        if (tempPosts1 == 0) {
            String noWay = Double.toString(avCommPost1);
            noWay = "OERATION FORBIDDEN";
        } else {
        avCommPost1 = tempComments1 / tempPosts1; }
        //Then
        Assertions.assertEquals(0, avPostUser1);
        Assertions.assertEquals(0.4, avCommUser1);
        Assertions.assertEquals("OPERATION FORBIDDEN", avCommPost1);
    }

    @Test
    void oneThousandPostsTest() {
        //Given
        List<String> testUsers2 = listOfNUsers(10);
        int users2 = 10;
        int posts2 = 1000;
        int comments2 = 4;
        //String noWay = "OPERATION FORBIDDEN";
        when(statisticsMock.usersNames()).thenReturn(testUsers2);
        when(statisticsMock.postsCount()).thenReturn(posts2);
        when(statisticsMock.commentsCount()).thenReturn(comments2);
        StatsCount statsCount = new StatsCount(statisticsMock);
        //When
        List<String> tempUserList2 = statsCount.userNameList(users2);
        int tempPosts2 = statsCount.numberOfPosts(posts2);
        int tempComments2 = statsCount.numberOfComments(comments2);
        double avPostUser2 = tempPosts2 / tempUserList2.size();
        double avCommUser2 = tempComments2 / tempUserList2.size();
        double avCommPost2 = tempComments2 / tempPosts2;
        //Then
        Assertions.assertEquals(100, avPostUser2);
        Assertions.assertEquals(0.4, avCommUser2);
        Assertions.assertNotEquals(0.004, avCommPost2);
    }

    @Test
    void zeroCommentsTest() {
        //Given
        List<String> testUsers3 = listOfNUsers(10);
        int users3 = 10;
        int posts3 = 2;
        int comments3 = 0;
        //String noWay = "OPERATION FORBIDDEN";
        when(statisticsMock.usersNames()).thenReturn(testUsers3);
        when(statisticsMock.postsCount()).thenReturn(posts3);
        when(statisticsMock.commentsCount()).thenReturn(comments3);
        StatsCount statsCount = new StatsCount(statisticsMock);
        //When
        List<String> tempUserList3 = statsCount.userNameList(users3);
        int tempPosts3 = statsCount.numberOfPosts(posts3);
        int tempComments3 = statsCount.numberOfComments(comments3);
        double avPostUser3 = tempPosts3 / tempUserList3.size();
        double avCommUser3 = tempComments3 / tempUserList3.size();
        double avCommPost3 = tempComments3 / tempPosts3;
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
        //String noWay = "OPERATION FORBIDDEN";
        when(statisticsMock.usersNames()).thenReturn(testUsers4);
        when(statisticsMock.postsCount()).thenReturn(posts4);
        when(statisticsMock.commentsCount()).thenReturn(comments4);
        StatsCount statsCount = new StatsCount(statisticsMock);
        //When
        List<String> tempUserList4 = statsCount.userNameList(users4);
        int tempPosts4 = statsCount.numberOfPosts(posts4);
        int tempComments4 = statsCount.numberOfComments(comments4);
        double avPostUser4 = tempPosts4 / tempUserList4.size();
        double avCommUser4 = tempComments4 / tempUserList4.size();
        double avCommPost4 = tempComments4 / tempPosts4;
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
        //String noWay = "OPERATION FORBIDDEN";
        when(statisticsMock.usersNames()).thenReturn(testUsers5);
        when(statisticsMock.postsCount()).thenReturn(posts5);
        when(statisticsMock.commentsCount()).thenReturn(comments5);
        StatsCount statsCount = new StatsCount(statisticsMock);
        //When
        List<String> tempUserList5 = statsCount.userNameList(users5);
        int tempPosts5 = statsCount.numberOfPosts(posts5);
        int tempComments5 = statsCount.numberOfComments(comments5);
        double avPostUser5 = tempPosts5 / tempUserList5.size();
        double avCommUser5 = tempComments5 / tempUserList5.size();
        double avCommPost5 = tempComments5 / tempPosts5;
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
        //String noWay = "OPERATION FORBIDDEN";
        when(statisticsMock.usersNames()).thenReturn(testUsers6);
        when(statisticsMock.postsCount()).thenReturn(posts6);
        when(statisticsMock.commentsCount()).thenReturn(comments6);
        StatsCount statsCount = new StatsCount(statisticsMock);
        //When
        List<String> tempUserList6 = statsCount.userNameList(users6);
        int tempPosts6 = statsCount.numberOfPosts(posts6);
        int tempComments6 = statsCount.numberOfComments(comments6);
        double avPostUser6 = tempPosts6 / tempUserList6.size();
        double avCommUser6 = tempComments6 / tempUserList6.size();
        double avCommPost6 = tempComments6 / tempPosts6;
        //Then
        Assertions.assertNotEquals(0, avPostUser6);
        Assertions.assertNotEquals(0, avCommUser6);
        Assertions.assertEquals(3, avCommPost6);
    }

    @Test
    void oneHundredUsersTest() {
        //Given
        List<String> testUsers7 = listOfNUsers(100);
        int users7 = 100;
        int posts7 = 40;
        int comments7 = 80;
        //String noWay = "OPERATION FORBIDDEN";
        when(statisticsMock.usersNames()).thenReturn(testUsers7);
        when(statisticsMock.postsCount()).thenReturn(posts7);
        when(statisticsMock.commentsCount()).thenReturn(comments7);
        StatsCount statsCount = new StatsCount(statisticsMock);
        //When
        List<String> tempUserList7 = statsCount.userNameList(users7);
        int tempPosts7 = statsCount.numberOfPosts(posts7);
        int tempComments7 = statsCount.numberOfComments(comments7);
        double avPostUser7 = tempPosts7 / tempUserList7.size();
        double avCommUser7 = tempComments7 / tempUserList7.size();
        double avCommPost7 = tempComments7 / tempPosts7;
        //Then
        Assertions.assertEquals(0.4, avPostUser7);
        Assertions.assertEquals(0.8, avCommUser7);
        Assertions.assertEquals(2, avCommPost7);
    }



}
