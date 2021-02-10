package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements OrderService{
    Producer producer;

    public ExtraFoodShop(Producer producer) {
        this.producer = producer;
    }

    public boolean order(User user, Producer producer) {
        System.out.println("First name: " + user.getName() + "\n" + "Second name: " + user.getSecondName() + "\n"
                + "Address: " + user.getAddress() + "\n" + "Phone: " + user.getPhoneNumber() + "\n"
                + "Company name: " + producer.getCompanyName() + "\n"
                + "Quantity: " + producer.getProductQuantity() + " Pieces" + producer.getProduct());
        return true;
    }
}
