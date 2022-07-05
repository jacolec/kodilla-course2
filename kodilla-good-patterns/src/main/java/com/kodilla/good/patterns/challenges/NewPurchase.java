package com.kodilla.good.patterns.challenges;

public interface NewPurchase {

    static boolean purchase(User user, String product, int quantity, String city) {
        System.out.println("NEW ORDER" + "\n" +
                "User: " + user.getUserName() + "\n" +
                "Product: " + product + "\n" +
                "Quantity: " + quantity + "\n" +
                "City: " + city);
        return true;
    }
}
