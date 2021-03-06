package com.kodilla.good.patterns.food2door;

public class OrderProcessor {

    private ProductService productService;
    private FoodRepository foodRepository;

    public OrderProcessor(ProductService productService, FoodRepository foodRepository) {
        this.productService = productService;
        this.foodRepository = foodRepository;
    }

    public FoodDto order(FoodRequest foodRequest) {
        boolean isOrdered = productService.process(foodRequest.getProduct(), foodRequest.getQuantity());
        if (isOrdered) {
            foodRepository.createOrder(foodRequest.getUser(), foodRequest.getProduct(), foodRequest.getQuantity(), foodRequest.getShop());
            return new FoodDto(foodRequest.getUser(), true);
        } else {
            return new FoodDto(foodRequest.getUser(), false);
        }
    }


}
