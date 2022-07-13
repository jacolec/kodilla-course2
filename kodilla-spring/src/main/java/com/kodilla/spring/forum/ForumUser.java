package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser implements User {

    private String username;

    public ForumUser() {
        this.username = "John Smith";
    }

    @Override
    public String getUserName() {
        return "John Smith";
    }
}
