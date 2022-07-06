package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements NewPurchase {

    private ProductPurchase productPurchase;
    private SendConfirmation sendConfirmation;
    private NewPurchase newPurchase;
    private NewOrder newOrder;

    public ProductOrderService(ProductPurchase productPurchase, SendConfirmation sendConfirmation, NewPurchase newPurchase, NewOrder newOrder) {
        this.productPurchase = productPurchase;
        this.sendConfirmation = sendConfirmation;
        this.newPurchase = newPurchase;
        this.newOrder = newOrder;
    }

    public boolean purchase(User user, String product, int quantity, String city) {

        System.out.println("NEW ORDER" + "\n" +
                "User: " + user.getUserName() + "\n" +
                "Product: " + product + "\n" +
                "Quantity: " + quantity + "\n" +
                "City: " + city);
        return true;

    }

    public PurchaseDto newPurchaseData(final NewOrder newOrder) {
        boolean isPurchased = newPurchase.purchase(newOrder.getUser(), newOrder.getProduct(), newOrder.getQuantity(), newOrder.getCity());
        if (isPurchased) {
            sendConfirmation.inform(newOrder.getUser());
            return new PurchaseDto(newOrder.getUser(), true);
        } else {
            return new PurchaseDto(newOrder.getUser(), false);
        }
    }
}
