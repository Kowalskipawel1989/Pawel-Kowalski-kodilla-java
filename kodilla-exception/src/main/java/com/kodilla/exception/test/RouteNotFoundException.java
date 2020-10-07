package com.kodilla.exception.test;

import java.util.Map;

public class RouteNotFoundException extends Exception{

    public static void main(String []args){

        FlightSearch flightSearch = new FlightSearch();

        try { flightSearch.findFlight(new Flight("Airport 10", "Airport11"));
            System.out.println("its ok");
        }catch (RouteNotFoundException e) {
            System.out.println("done");
        }
    }

}
