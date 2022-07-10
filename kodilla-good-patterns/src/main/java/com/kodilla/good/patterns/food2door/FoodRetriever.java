package com.kodilla.good.patterns.food2door;

public class FoodRetriever implements ProductService {

    public FoodRequest retrieve() {

        User user = new User("jacolec", "Jacek Wydro", "Kobylka");
        String product = "healthyProduct";
        int quantity = 1;
        String shop = "HealthyShop";

        return new FoodRequest(user, product, quantity, shop);
    }

    @Override
    public boolean process(String product, int quantity) {
        System.out.println("Thank you for buying product from our Shop." + "\n" +
                "Products purchased: " + product + "\n" +
                "Quantity: " + quantity);
        return true;
    }
}
