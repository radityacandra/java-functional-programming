package com.happyfresh;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HigherOrderFunction {
    public static void main(String[] args) {
        List<OrderItem> orderItems = List.of(
                new OrderItem(1L, "WJN01", 2, 1L),
                new OrderItem(2L, "WJN03", 4, 3L)
        );

        List<Order> orders = List.of(
                new Order(1L, new Date(), orderItems, "complete", new Date(), 25600),
                new Order(2L, new Date(), orderItems, "complete", new Date(), 32000),
                new Order(3L, new Date(), orderItems, "canceled", new Date(), 25000),
                new Order(3L, new Date(), orderItems, "canceled", new Date(), 20000)
        );

        Map<String, Integer> summary = orders
                .stream()
                .collect(Collectors.groupingBy((order) -> order.getStatus())) // Map<String, List<Order>>
                .entrySet()
                .stream()
                .collect(Collectors.toMap(
                        (entry) -> entry.getKey(),
                        (entry) -> {
                            return entry
                                    .getValue()
                                    .stream()
                                    .map((order) -> order.getTotalOrder())
                                    .reduce(0, (acc, totalOrder) -> {
                                        return acc + totalOrder;
                                    }) / entry.getValue().size();
                        }
                ));

        System.out.println(summary);
    }
}
