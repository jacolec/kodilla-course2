package com.kodilla.good.patterns.challenges;

public class ProductPurchase {

    private String productName;
    private int productQuantity;
    private User user;
    private String shippingAdress;

    public ProductPurchase(String productName, int productQuantity, User user, String shippingAdress) {
        this.productName = productName;
        this.productQuantity = productQuantity;
        this.user = user;
        this.shippingAdress = shippingAdress;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public User getUser() {
        return user;
    }

    public String getShippingAdress() {
        return shippingAdress;
    }




}
