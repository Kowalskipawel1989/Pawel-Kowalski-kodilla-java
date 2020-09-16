package com.kodilla.stream.world;

public final class Continent {
    String countryName;
    Country country;

    public Continent(String countryName, Country country) {
        this.countryName = countryName;
        this.country = country;
    }

    public String getCountryName() {
        return countryName;
    }

    public Country getCountry() {
        return country;
    }
}

