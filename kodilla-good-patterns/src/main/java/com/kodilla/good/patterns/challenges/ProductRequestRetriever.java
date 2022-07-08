package com.kodilla.good.patterns.challenges;

public class ProductRequestRetriever implements ProductService {

    public ProductRequest retrieve() {

        User user = new User("jacolec", "Jacek Wydro", "Kobylka");
        String product = "nordic walking poles";
        int quantity = 1;

        return new ProductRequest(user, product, quantity);
    }


    @Override
    public boolean purchase(User user, String product, int quantity) {
        System.out.println("PROCESSING ORDER: " + "\n" +
                        "User: " + user + "\n" +
                "Product: " + product + "\n" +
                "Quantity: " + quantity);
        return true;
    }
}
