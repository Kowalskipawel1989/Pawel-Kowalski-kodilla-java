package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    String countryName;
    BigDecimal peopleQuantity;

    public Country(String countryName, BigDecimal peopleQuantity) {
        this.countryName = countryName;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity(){
        return BigDecimal.ZERO;
    }
}
