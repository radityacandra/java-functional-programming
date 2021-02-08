package com.happyfresh;

public class OrderItem {
    private Long id;
    private String productCode;
    private int quantity;
    private Long shopId;

    public OrderItem(Long id, String productCode, int quantity, Long shopId) {
        this.id = id;
        this.productCode = productCode;
        this.quantity = quantity;
        this.shopId = shopId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }
}
