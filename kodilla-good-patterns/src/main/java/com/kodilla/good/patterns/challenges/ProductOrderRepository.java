package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository{
    public boolean createOrder(final User user, final LocalDateTime from, LocalDateTime shipment){
        System.out.println("Name: " + user.getName() +"\n" + "Second name: " + user.getSecondName() + "\n" + "Nick: "
                            + user.getNickName() + "\n" + "Order: " + from.toString() + "\n"
                            + "shipping order: " + shipment.toString());
        return true;
    }
}
