package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightRepositoryTest {

    @Test
    public void testFindFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsFrom("Berlin");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Berlin", "Warsaw"));
        expectedList.add(new Flight("Berlin", "LA"));
        expectedList.add(new Flight("Berlin", "Malta"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsTo("London");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Moscow", "London"));
        expectedList.add(new Flight("Berlin", "London"));
        expectedList.add(new Flight("Paris", "London"));
        assertEquals(expectedList, result);
    }
}