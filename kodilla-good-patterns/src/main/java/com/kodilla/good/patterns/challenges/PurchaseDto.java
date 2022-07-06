package com.kodilla.good.patterns.challenges;

public class PurchaseDto {

    private User user;
    private boolean isPurchased; //depends od product name and available quantity

    public PurchaseDto(User user, boolean isPurchased) {
        this.user = user;
        this.isPurchased = isPurchased;
    }

    public User getUser() {
        return user;
    }

    public boolean isPurchased() {
        return isPurchased;
    }
}
