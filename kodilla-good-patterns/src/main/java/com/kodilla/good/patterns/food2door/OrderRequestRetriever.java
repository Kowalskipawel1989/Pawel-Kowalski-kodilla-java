package com.kodilla.good.patterns.food2door;

public class OrderRequestRetriever {
    public OrderRequest retriever(){
        User user = new User("Thomas", "Wolf", "Stockenweg 2", 554-122-233);
        ExtraFoodShop extraFoodShop = new ExtraFoodShop(new Producer("ExtraFoodShop", 3,"masło"));
        return new OrderRequest(user, extraFoodShop.producer);
    }
}
