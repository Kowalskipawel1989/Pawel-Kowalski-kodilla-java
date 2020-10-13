package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){

        User user = new User("Pablo", "Smith","Pablo12","Dzielna 12",515155982);

        LocalDateTime orderFrom = LocalDateTime.of(2020,04,22,9,12,45);
        LocalDateTime orderShipment = LocalDateTime.of(2020,04,22,11,22,45);

        return new OrderRequest(user, orderFrom, orderShipment);
    }
}
