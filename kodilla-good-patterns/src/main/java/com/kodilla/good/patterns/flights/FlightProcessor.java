package com.kodilla.good.patterns.flights;

import java.util.HashMap;
import java.util.Map;

public class FlightProcessor {

    private FlightService flightService;
    private FlightRepository flightRepository;

    public FlightProcessor(FlightService flightService, FlightRepository flightRepository) {
        this.flightService = flightService;
        this.flightRepository = flightRepository;
    }

    public FlightDto process(FlightRequest flightRequest) {

        boolean isAvailable = flightService.findflight(flightRequest.getFlight());
        if (isAvailable) {
            flightRepository.create(flightRequest.getFlight());
            return new FlightDto(flightRequest.getFlight(), true);
        } else {
            return new FlightDto(flightRequest.getFlight(), false);
        }
    }
}
