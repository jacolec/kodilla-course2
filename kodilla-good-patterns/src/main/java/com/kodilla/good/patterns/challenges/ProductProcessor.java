package com.kodilla.good.patterns.challenges;

public class ProductProcessor {

    private InformationService informationService;
    private ProductService productService;
    private ProductRepository productRepository;

    public ProductProcessor(InformationService informationService, ProductService productService, ProductRepository productRepository) {
        this.informationService = informationService;
        this.productService = productService;
        this.productRepository = productRepository;
            }

    public ProductDto process(ProductRequest productRequest) {

        boolean isPurchased = productService.purchase(productRequest.getUser(),
                productRequest.getProduct(),
                productRequest.getQuantity());

        if (isPurchased) {
            informationService.confirm(productRequest.getUser());
            productRepository.createOrder(productRequest.getUser(),
                    productRequest.getProduct(),
                    productRequest.getQuantity());
            return new ProductDto(productRequest.getUser(), true);
        } else {
            return new ProductDto(productRequest.getUser(), false);
        }

    }



}
