package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService {
    public boolean order(final User user, final LocalDateTime from, LocalDateTime shipment){
        System.out.println("an order from the user: " + user.getName() + user.getSecondName() + user.getNickName()
        + "Order of the day: " + from.toString() + "shipping the day order: " + shipment.toString());
        return true;

    }
}
