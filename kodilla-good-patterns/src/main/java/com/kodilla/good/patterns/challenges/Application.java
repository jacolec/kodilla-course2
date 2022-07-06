package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        NewOrder newOrder = orderRetriever.retrieve();
        ProductOrderService productOrderService = new ProductOrderService(new ProductPurchase(newOrder.getProduct(), newOrder.getQuantity(), newOrder.getUser(), newOrder.getCity()),
                newOrder.inform(newOrder.getUser()),

    }

}
