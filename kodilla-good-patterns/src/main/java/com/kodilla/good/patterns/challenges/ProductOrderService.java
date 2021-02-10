package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService{
    public boolean order(final User user, final LocalDateTime from, LocalDateTime shipment){
        System.out.println("an order from the user: " + user.getName() + " " + user.getSecondName() + " nick: " + user.getNickName()
        + " Order of the day: " + from.toString() + " shipping the day order: " + shipment.toString());
        return true;

    }
}
