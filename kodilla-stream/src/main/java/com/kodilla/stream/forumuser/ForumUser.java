package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;
import java.time.*;

public final class ForumUser {

    private final int id;
    private final String userName;
    private final char sex;
    private final LocalDate date;
    private final int post;

    public ForumUser(final int id, final String userName, final char sex, final int year, final int month, final int day, final int post) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.date = LocalDate.of(year, month, day);
        this.post = post;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDate() {
        return date;
    }

    public int getPost() {
        return post;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", date=" + date +
                ", post=" + post +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return (id == forumUser.id) &&
                (sex == forumUser.sex) &&
                (post == forumUser.post) &&
                Objects.equals(userName, forumUser.userName) &&
                Objects.equals(date, forumUser.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, userName, sex, date, post);
    }
}
