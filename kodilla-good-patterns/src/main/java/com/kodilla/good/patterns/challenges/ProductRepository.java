package com.kodilla.good.patterns.challenges;

public interface ProductRepository {

    void createOrder(User user, String product, int quantity);
}
