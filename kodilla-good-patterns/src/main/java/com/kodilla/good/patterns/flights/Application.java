package com.kodilla.good.patterns.flights;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        Map<Flight, Boolean> flightMap = new HashMap<>();

        flightMap.put(new Flight("Warsaw", "London"), true);
        flightMap.put(new Flight("Paris", "Madrid"), false);
        flightMap.put(new Flight("Gdansk", "Rome"), true);
        flightMap.put(new Flight("Berlin", "Moscow"), true);
        flightMap.put(new Flight("Chicago", "Cracow"), false);

        FlightRequestRetriever retriever = new FlightRequestRetriever();
        FlightRequest flightRequest = retriever.retrieve();

        Map.Entry<Flight, Boolean> tempFlightMap = flightMap.entrySet()
                .stream()
                .map(e -> e.getKey())
                .filter(s -> s.equals(flightRequest))
                .






    }
}
