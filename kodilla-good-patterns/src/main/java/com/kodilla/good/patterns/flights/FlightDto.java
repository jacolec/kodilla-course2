package com.kodilla.good.patterns.flights;

public class FlightDto {

    private Flight flight;
    private boolean isAvailable;

    public FlightDto(Flight flight, boolean isAvailable) {
        this.flight = flight;
        this.isAvailable = isAvailable;
    }

    public Flight getFlight() {
        return flight;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
