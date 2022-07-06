package com.kodilla.good.patterns.challenges;
newOrder.getUser
public class Application {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        NewOrder newOrder = orderRetriever.retrieve();
        ProductOrderService productOrderService = new ProductOrderService();
    }

}
