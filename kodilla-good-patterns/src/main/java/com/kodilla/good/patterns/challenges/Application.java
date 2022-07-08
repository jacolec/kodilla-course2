package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {

        ProductRequestRetriever productRequestRetriever = new ProductRequestRetriever();
        ProductRequest productRequest = productRequestRetriever.retrieve();
        ProductProcessor productProcessor = new ProductProcessor(new ConfirmationService(), productRequestRetriever, productRequest);
        productProcessor.process(productRequest);
    }
}
