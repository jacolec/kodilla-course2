package com.kodilla.good.patterns.challenges;

public class NewOrder implements SendConfirmation {

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

    public User getUser() {
        return user;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCity() {
        return city;
    }

    public void inform(User user) {
        System.out.println("the email confirmation has been sent!");
    }
}
