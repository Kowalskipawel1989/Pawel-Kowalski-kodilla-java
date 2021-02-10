package com.kodilla.good.patterns.food2door;

public class Producer {
    String companyName;
    int productQuantity;
    String product;

    public Producer(String companyName, int productQuantity, String product) {
        this.companyName = companyName;
        this.productQuantity = productQuantity;
        this.product = product;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public String getProduct() {
        return product;
    }
}
