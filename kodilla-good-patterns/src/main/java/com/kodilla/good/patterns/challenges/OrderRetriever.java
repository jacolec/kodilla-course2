package com.kodilla.good.patterns.challenges;

public class OrderRetriever {

    public NewOrder retrieve() {

        User user1 = new User("jacolec", "Jacek Wydro", "example@example.com");
        String product1 = "nordic walking poles";
        int quantity1 = 1;
        String city1 = "Kobylka";

        return new NewOrder(user1, product1, quantity1, city1);
    }
}
