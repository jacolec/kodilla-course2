package com.kodilla.good.patterns.challenges;

public class PurchaseDto {

    private User user;
    private boolean isProductAvailable; //depends od product name and available quantity

    public PurchaseDto(User user, boolean isProductAvailable) {
        this.user = user;
        this.isProductAvailable = isProductAvailable;
    }

    public User getUser() {
        return user;
    }

    public boolean isProductAvailable() {
        return isProductAvailable;
    }
}
