package com.kodilla.good.patterns.food2door;

public interface OrderRepository {
    boolean createOrder(User user, Producer producer);
}
