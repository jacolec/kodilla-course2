package com.kodilla.good.patterns.flights;

public class FlightRequestRetriever implements FlightService {

    public FlightRequest retrieve() {

        String departure = "Warsaw";
        String arrival = "London";

        return new FlightRequest(new Flight(departure, arrival));
    }

    @Override
    public boolean findflight(Flight flight) {
        System.out.println("SEARCHING FOR FLIGHT: " + "\n" +
                "Departure from: " + flight.getDeparture() + "\n" +
                "Arrival to: " + flight.getArrival());
        return true;
    }
}
