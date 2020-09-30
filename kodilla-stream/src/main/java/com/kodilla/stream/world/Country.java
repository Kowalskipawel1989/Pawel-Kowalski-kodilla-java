package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    private final BigDecimal quantity;

    public Country(final String countryName,final BigDecimal quantity) {
        this.countryName = countryName;
        this.quantity = quantity;
    }
    public String getCountryName() {
        return countryName;
    }
    public BigDecimal getQuantity() {
        return quantity;
    }
    public BigDecimal getPeopleQuantity(){
        return BigDecimal.ZERO;
    }
}
