package com.kodilla.stream.world;

import java.util.List;

public final class Continent {
    List<Country> countryList;

    public Continent(List<Country> countryList) {
        this.countryList = countryList;
    }

    public List<Country> getCountryList() {
        return countryList;
    }
}

