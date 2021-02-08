package com.happyfresh;

import java.util.Date;
import java.util.List;

public class Order {
    private Long id;
    private Date orderDate;
    private List<OrderItem> orderItems;
    private String status;
    private Date deliveryTime;
    private int totalOrder;

    public Order(Long id, Date orderDate, List<OrderItem> orderItems, String status, Date deliveryTime, int totalOrder) {
        this.id = id;
        this.orderDate = orderDate;
        this.orderItems = orderItems;
        this.status = status;
        this.deliveryTime = deliveryTime;
        this.totalOrder = totalOrder;
    }

    public int getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(int totalOrder) {
        this.totalOrder = totalOrder;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
}