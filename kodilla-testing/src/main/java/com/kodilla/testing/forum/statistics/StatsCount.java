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


    public List<String> userNameList(int u) {
        return statistics.usersNames();
    }
    public int numberOfPosts(int p) {
        return statistics.postsCount();
    }
    public int numberOfComments(int c) {
        return statistics.commentsCount();
    }

    public void calculateAdvStatistics(Statistics statistics) {
        String zeroDivision = null;
        List<String> calculationUserList = statistics.usersNames();
        userNum = calculationUserList.size();
        if ((userNum == 0) || (postNum == 0)) {
            zeroDivision = "OPERATION FORBIDDEN";
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
