package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;
import java.time.*;

public class Forum {

    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(1, "user1", 'M', 1980, 4, 6, 20));
        forumUsers.add(new ForumUser(2, "user2", 'K', 1998, 1, 5, 30));
        forumUsers.add(new ForumUser(3, "user3", 'K', 2004, 8, 19, 20));
        forumUsers.add(new ForumUser(4, "user4", 'M', 1995, 11, 25, 10));
        forumUsers.add(new ForumUser(5, "user5", 'M', 1989, 10, 5, 40));
        forumUsers.add(new ForumUser(6, "user6", 'K', 2000, 3, 20, 50));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsers);
    }




}
