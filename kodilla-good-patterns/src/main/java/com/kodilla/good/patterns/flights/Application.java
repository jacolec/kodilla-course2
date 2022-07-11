package com.kodilla.good.patterns.flights;


import java.util.List;

public class Application {

    public static void main(String[] args) {

        FlightList flightList = new FlightList();
        FlightService flightService = new FlightSearchService(flightList);
        FlightProcessor flightProcessor = new FlightProcessor(flightService);
        flightProcessor.process();
    }




}
