package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightSearchService implements FlightService {

    private final FlightList flightList;

    public FlightSearchService(final FlightList flightList) {
        this.flightList = flightList;
    }

    @Override
    public List<Flight> searchFlightTo(String airportCity) {
        List<Flight> tempFlightList = flightList.getFlightList()
                .stream()
                .filter(e -> e.getArrival().equals(airportCity))
                .collect(Collectors.toList());
        return tempFlightList;
    }

    @Override
    public List<Flight> searchFlightFrom(String airportCity) {
        List<Flight> tempFlightList = flightList.getFlightList()
                .stream()
                .filter(e -> e.getDeparture().equals(airportCity))
                .collect(Collectors.toList());
        return tempFlightList;
    }

    @Override
    public List<Flight> searchFlightWithStop(String arrivalCity, String departureCity) {
        Map<String, Flight> tempFlightList1 = flightList.getFlightList()
                .stream()
                .filter(e -> e.getDeparture().equals(departureCity))
                .collect(Collectors.toMap(f -> f.getArrival(), f -> f));
        Map<String, Flight> tempFlightList2 = flightList.getFlightList()
                .stream()
                .filter(e -> e.getArrival().equals(arrivalCity))
                .collect(Collectors.toMap(f -> f.getDeparture(), f -> f));
        List<Flight> flightWithStopList = new ArrayList<>();
        for (Map.Entry<String, Flight> tempMap1: tempFlightList1.entrySet()) {
            flightWithStopList.add(tempMap1.getValue());
        }
        for (Map.Entry<String, Flight> tempMap2: tempFlightList2.entrySet()) {
            flightWithStopList.add(tempMap2.getValue());
        }
        return flightWithStopList;
    }
}
