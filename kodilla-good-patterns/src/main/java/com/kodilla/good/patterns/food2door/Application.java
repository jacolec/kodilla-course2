package com.kodilla.good.patterns.food2door;

public class Application {

    public static void main(String[] args) {

        FoodRetriever foodRetriever = new FoodRetriever();
        FoodRequest foodRequest = foodRetriever.retrieve();
        OrderProcessor orderProcessor = new OrderProcessor(foodRetriever, foodRequest);
        orderProcessor.order(foodRequest);




    }


}
