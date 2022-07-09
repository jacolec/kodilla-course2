package com.kodilla.good.patterns.food2door;

public class Retriever {

    public FoodRequest retrieve() {

        User user = new User("jacolec", "Jacek Wydro", "Kobylka");
        String product = "healthyProduct";
        int quantity = 1;
        String shop = "HealthyShop";

        return new FoodRequest(user, product, quantity, shop);
    }
}
