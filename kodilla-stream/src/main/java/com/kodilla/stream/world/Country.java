package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    String countryName;
    BigDecimal quantity;

    public Country(String countryName, String quantity) {
        this.countryName = countryName;
        this.quantity = quantity;
    }

    public String getCountryName() {
        return countryName;
    }
    public BigDecimal getQuantity(){
        return quantity;
    }

    public BigDecimal getPeopleQuantity(){
        return BigDecimal.ZERO;
    }
}
