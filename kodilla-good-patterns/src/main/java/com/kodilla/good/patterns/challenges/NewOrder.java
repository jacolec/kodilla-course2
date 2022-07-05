package com.kodilla.good.patterns.challenges;

public class NewOrder {

    private User user;
    private String product;
    private int quantity;
    private String city;

    public NewOrder(User user, String product, int quantity, String city) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.city = city;
    }
}
