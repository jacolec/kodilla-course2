package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

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

    public PurchaseDto newPurchaseData(final NewOrder newOrder) {
        boolean isPurchased = newPurchase.





    }




}
