package com.kodilla.good.patterns.flights;

import java.util.ArrayList;
import java.util.List;

public class FlightList {

    private final List<Flight> flightList = new ArrayList<>();

    public List<Flight> getFlightList() {

        flightList.add(new Flight("Cracow", "Riga"));
        flightList.add(new Flight("Warsaw", "Chicago"));
        flightList.add(new Flight("Paris", "Moscow"));
        flightList.add(new Flight("Rome", "Warsaw"));
        flightList.add(new Flight("Stockholm", "Warsaw"));
        flightList.add(new Flight("Poznan", "Amsterdam"));
        flightList.add(new Flight("Warsaw", "London"));
        flightList.add(new Flight("Riga", "Amsterdam"));
        flightList.add(new Flight("Moscow", "Tokio"));

        return new ArrayList<>(flightList);
    }
}
