package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements ProductService {

    private String product;
    private int quantity;
    private String shopName;

    public GlutenFreeShop(String product, int quantity, String shopName) {
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
        System.out.println("Thank you for buying product " + getProduct() + "from GlutenFreeShop." + "\n" +
                "Products purchased: " + getQuantity());
        return true;
    }
}
