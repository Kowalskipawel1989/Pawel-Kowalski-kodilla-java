package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightSearch {
    public void findFlight(Flight flight){
        Map<String, Boolean> flightSearch = new HashMap<String, Boolean>();
        flightSearch.entrySet(flight.getArrivalAirport(),flight.getDepartureAirport());
    }
}
