package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public String findFilght (Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightMap = new HashMap<>();
        flightMap.put("Warsaw", true);
        flightMap.put("Chicago", true);
        flightMap.put("Paris", true);

        if ((flightMap.get(flight.getArrivalAirport()) == false)
            || (flightMap.get(flight.getDepartureAirport()) == false)
                || (flightMap.get(flight.getDepartureAirport()) == null)
                || (flightMap.get(flight.getArrivalAirport()) == null)) {

            throw new RouteNotFoundException();

            } else {
                System.out.println("Flight is available! Book your tickets!");
            }

        return ("Chosen flight: FROM " + flight.getDepartureAirport() + " TO " + flight.getArrivalAirport());
    }

    public static void main(String[] args) {

        Flight flight1 = new Flight("Warsaw", "Chicago");
        FlightFinder flightFinder = new FlightFinder();
        String result = "";
        try {
            result = flightFinder.findFilght(flight1);
        } catch (RouteNotFoundException e) {
            System.out.println("No flights available. Try another route.");
        } finally {
            System.out.println("Don't give up - keep searching! :)");
        }
    }
}
