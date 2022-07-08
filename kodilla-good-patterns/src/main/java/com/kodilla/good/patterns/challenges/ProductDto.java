package com.kodilla.good.patterns.challenges;

public class ProductDto {

    private User user;
    private boolean isPurchased;

    public ProductDto(User user, boolean isPurchased) {
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
