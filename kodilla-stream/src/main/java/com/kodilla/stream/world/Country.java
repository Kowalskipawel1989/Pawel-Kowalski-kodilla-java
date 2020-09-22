package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {
    String countryName;
    int quantity;

    public Country(String countryName, int quantity) {
        this.countryName = countryName;
        this.quantity = quantity;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;

        Country country = (Country) o;

        if (quantity != country.quantity) return false;
        return countryName.equals(country.countryName);
    }


    public BigDecimal getPeopleQuantity(){
        return BigDecimal.ZERO;
    }
}
