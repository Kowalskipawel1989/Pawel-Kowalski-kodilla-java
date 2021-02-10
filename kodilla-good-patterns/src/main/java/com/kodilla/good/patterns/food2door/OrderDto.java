package com.kodilla.good.patterns.food2door;

public class OrderDto {
    public User user;
    public Producer producer;
    public boolean isOrdered;

    public OrderDto(User user, Producer producer, boolean isOrdered) {
        this.user = user;
        this.producer = producer;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public Producer getProducer() {
        return producer;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
