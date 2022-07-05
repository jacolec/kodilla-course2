package com.kodilla.good.patterns.challenges;

public class User {

    private String userName;
    private String realName;
    private String email;

    public User(String userName, String realName, String email) {
        this.userName = userName;
        this.realName = realName;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getRealName() {
        return realName;
    }

    public String getEmail() {
        return email;
    }
}
