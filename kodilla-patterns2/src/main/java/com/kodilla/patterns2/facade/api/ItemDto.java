package com.kodilla.patterns2.facade.api;

public final class ItemDto {

    private final Long productId;
    private final double qty;

    public ItemDto(Long productId, double quantity) {
        this.productId = productId;
        this.qty = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public double getQty() {
        return qty;
    }
}
