package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements ProductService {

    private String product;
    private int quantity;
    private String shopName;

    public ExtraFoodShop(String product, int quantity, String shopName) {
        this.product = product;
        this.quantity = quantity;
        this.shopName = shopName;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getShopName() {
        return shopName;
    }

    @Override
    public boolean process(String product, int quantity) {
        System.out.println("Thank you for buying product " + getProduct() + "from ExtraFoodShop." + "\n" +
                "Products purchased: " + getQuantity());
        return true;
    }
}
