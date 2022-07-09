package com.kodilla.good.patterns.food2door;

public interface FoodRepository {

    void createOrder(User user, String product, int quantity, String shop);

}
