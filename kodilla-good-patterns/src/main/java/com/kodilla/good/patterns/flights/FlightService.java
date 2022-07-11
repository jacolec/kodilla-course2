package com.kodilla.good.patterns.flights;

import java.util.List;

public interface FlightService {
    List<Flight> searchFlightTo(String airportCity);
    List<Flight> searchFlightFrom(String airportCity);
    List<Flight> searchFlightWithStop(String arrivalCity, String departureCity);
}
