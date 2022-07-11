package com.kodilla.good.patterns.flights;


import java.util.List;

public class FlightProcessor {

    private FlightService flightService;

    public FlightProcessor(FlightService flightService) {
        this.flightService = flightService;
    }

    public void process() {

        List<Flight> flightsFromList =  flightService.searchFlightFrom("Warsaw");
        System.out.println("SEARCHING FOR FLIGHTS FROM: Warsaw..." + "\n" +
                "Flights found: " + "\n" +
                flightsFromList);
        List<Flight> flightsToList =  flightService.searchFlightTo("Amsterdam");
        System.out.println("SEARCHING FOR FLIGHTS TO: Riga..." + "\n" +
                "Flights found: " + "\n" +
                flightsToList);
        List<Flight> flightsWithStopList = flightService.searchFlightWithStop("Cracow", "Amsterdam");
        System.out.println("SEARCHING FOR FLIGHTS FROM: Cracow TO: Amsterdam..." + "\n" +
                "Flights found: " + "\n" +
                flightsWithStopList);
    }
}
