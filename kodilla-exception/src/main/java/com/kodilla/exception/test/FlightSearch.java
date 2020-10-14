package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightSearch {

    public void findFlight (Flight flight) throws RouteNotFoundException {
        HashMap<Flight, Boolean> airportFinder = new HashMap<>();

        Flight flight1 = new Flight("Airport 1", "Airport 2");
        Flight flight2 = new Flight("Airport 2", "Airport 1");
        Flight flight3 = new Flight("Airport 3", "Airport 1");
        Flight flight4 = new Flight("Airport 2", "Airport 4");
        Flight flight5 = new Flight("Airport 1", "Airport 4");
        Flight flight6 = new Flight("Airport 1", "Airport 3");
        Flight flight7 = new Flight("Airport 3", "Airport 2");

        airportFinder.put(flight1, true);
        airportFinder.put(flight2, true);
        airportFinder.put(flight3, false);
        airportFinder.put(flight4, true);
        airportFinder.put(flight5, true);
        airportFinder.put(flight6, true);
        airportFinder.put(flight7, true);
        if(airportFinder.get(flight) == null || airportFinder.get(flight)) {

            throw new RouteNotFoundException();
        }
    }

    public static void main(String []args){

        FlightSearch flightSearch = new FlightSearch();

        try { flightSearch.findFlight(new Flight("airport 6", "airport 2"));
            System.out.println("Flight found");
        }catch (RouteNotFoundException e) {
            System.out.println("This fly is not here");
        }
    }
}
