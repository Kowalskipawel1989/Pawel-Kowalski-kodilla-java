package com.kodilla.good.patterns.food2door;

public class OrderRequest {
    User user;
    Producer producer;

    public OrderRequest(User user, Producer producer) {
        this.user = user;
        this.producer = producer;
    }

    public User getUser() {
        return user;
    }

    public Producer getProducer() {
        return producer;
    }
}
