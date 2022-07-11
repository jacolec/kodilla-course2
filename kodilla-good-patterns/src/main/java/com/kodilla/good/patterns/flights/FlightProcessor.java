package com.kodilla.good.patterns.flights;


public class FlightProcessor {

    private FlightService flightService;
    private FlightRepository flightRepository;

    public FlightProcessor(FlightService flightService, FlightRepository flightRepository) {
        this.flightService = flightService;
        this.flightRepository = flightRepository;
    }

    public Flight process(FlightRequest flightRequest) {

        boolean checkDeparture = flightService.flyFrom(flightRequest.getFlight());
        boolean checkArrival = flightService.flyTo(flightRequest.getFlight());

        if (checkDeparture) {
            flightRepository.create(flightRequest.getFlight());
            return new Flight(flightRequest.getFlight().getDeparture(), flightRequest.getFlight().getArrival());
        } else if (checkArrival) {
            flightRepository.create(flightRequest.getFlight());
            return new Flight(flightRequest.getFlight().getDeparture(), flightRequest.getFlight().getArrival());
        } else {
            return new Flight(null, null);
        }
    }
}
