package com.kodilla.good.patterns.food2door;

public class FoodDto {

    private User user;
    private boolean isOrdered;

    public FoodDto(User user, boolean isOrdered) {
        this.user = user;
        this.isOrdered = isOrdered;
    }
}
