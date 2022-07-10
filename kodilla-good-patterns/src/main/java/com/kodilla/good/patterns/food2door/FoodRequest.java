package com.kodilla.good.patterns.food2door;

public class FoodRequest implements FoodRepository {

    private User user;
    private String product;
    private int quantity;
    private String shop;

    public FoodRequest(User user, String product, int quantity, String shop) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.shop = shop;
    }

    public User getUser() {
        return user;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getShop() {
        return shop;
    }

    @Override
    public void createOrder(User user, String product, int quantity, String shop) {
        System.out.println("NEW ORDER" + "\n" +
                "User: " + getUser() + "\n" +
                "Product: " + getProduct() + "\n" +
                "Quantity: " + getQuantity() + "\n" +
                "Shop: " + getShop());
    }
}
