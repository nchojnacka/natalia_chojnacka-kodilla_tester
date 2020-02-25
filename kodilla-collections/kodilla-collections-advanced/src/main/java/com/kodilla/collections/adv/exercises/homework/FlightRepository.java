package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() { // dlaczego musialam zrobic liste static?
        List<Flight>getFlightsTable = new ArrayList<>();
        getFlightsTable.add(new Flight("Berlin", "Warsaw"));
        getFlightsTable.add(new Flight("Berlin", "LA"));
        getFlightsTable.add(new Flight("Berlin", "Malta"));
        getFlightsTable.add(new Flight("Moscow", "London"));
        getFlightsTable.add(new Flight("Paris", "London"));
        getFlightsTable.add(new Flight("Berlin", "London"));
        return getFlightsTable;
    }
}
