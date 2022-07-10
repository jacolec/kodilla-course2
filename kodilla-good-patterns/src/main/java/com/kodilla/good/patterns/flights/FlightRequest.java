package com.kodilla.good.patterns.flights;

public class FlightRequest implements FlightRepository {

    private Flight flight;

    public FlightRequest(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    @Override
    public void create(Flight flight) {
        System.out.println("CREATING FLIGHT REQUEST" + "\n" +
                "Deaperture from: " + flight.getDeparture() + "\n" +
                "Arrival to: " + flight.getArrival());
    }
}
