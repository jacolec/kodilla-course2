package com.kodilla.good.patterns.challenges;

public class ProductRequest implements ProductRepository {

    private User user;
    private String product;
    private int quantity;

    public ProductRequest(User user, String product, int quantity) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
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

    @Override
    public void createOrder(User user, String product, int quantity) {
        System.out.println("NEW ORDER" + "\n" +
                "User: " + getUser() + "\n" +
                "Product: " + getProduct() + "\n" +
                "Quantity: " + getQuantity());

    }


}
