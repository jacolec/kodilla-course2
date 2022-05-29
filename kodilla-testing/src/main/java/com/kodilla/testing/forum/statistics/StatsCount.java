package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class StatsCount {

    private Statistics statistics;

    public StatsCount(Statistics statistics) {
        this.statistics = statistics;
    }
    private int userNum;
    private int postNum;
    private int commentNum;
    private double averagePost;
    private double averageComment;
    private double averageCommPost;

    public void calculateAdvStatistics(Statistics statistics) {
        String zeroDivision = null;
        List<String> userList = statistics.usersNames();
        userNum = userList.size();
        postNum = statistics.postsCount();
        commentNum = statistics.commentsCount();
        averagePost = 0;
        averageComment = 0;
        averageCommPost = 0;
        if (userNum == 0)  {
            zeroDivision = "FORBIDDEN OPERATION";
        } else {
            averagePost = postNum / userNum;
            averageComment = commentNum / userNum;
            averageCommPost = commentNum / postNum;
        }
    }

    public void showStatistics() {
        System.out.println("Number of users: " + userNum + "\n" +
                "Number of posts: " + postNum + "\n" +
                "Number of comments: " + commentNum + "\n" +
                "Posts per user: " + averagePost + "\n" +
                "Comments per user: " + averageComment + "\n" +
                "Comments per post: " + averageCommPost);
    }


}
