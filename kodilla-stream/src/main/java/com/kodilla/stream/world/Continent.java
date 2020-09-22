package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    String continentName;
    List<Country> countryList = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }
}

