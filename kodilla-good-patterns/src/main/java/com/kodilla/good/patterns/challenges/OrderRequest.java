package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private User user;
    private LocalDateTime from;
    private LocalDateTime shipment;

    public OrderRequest(final User user, final LocalDateTime from, final LocalDateTime shipment) {
        this.user = user;
        this.from = from;
        this.shipment = shipment;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getShipment() {
        return shipment;
    }
}
