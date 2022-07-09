package com.kodilla.good.patterns.food2door;

public class User {

    private String name;
    private String realName;
    private String city;

    public User(String name, String realName, String city) {
        this.name = name;
        this.realName = realName;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getRealName() {
        return realName;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", realName='" + realName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
