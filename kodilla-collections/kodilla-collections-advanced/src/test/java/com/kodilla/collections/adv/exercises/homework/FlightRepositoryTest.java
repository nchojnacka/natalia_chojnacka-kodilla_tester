package com.kodilla.collections.adv.exercises.homework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class FlightRepositoryTest {

    @Test
    public void testFindFlightsFrom() {
        FlightFinder flightFinder = new FlightFinder();
        List<Flight> result = flightFinder.findFlightsFrom("Berlin");
        List<Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("Berlin", "Warsaw"));
        expectedList.add(new Flight("Berlin", "LA"));
        expectedList.add(new Flight("Berlin", "Malta"));
        expectedList.add(new Flight("Berlin", "London"));

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

        List<Boolean> listaTrue = new ArrayList<>();

        for(Flight flightFromExpectedList : expectedList){
            for(Flight flightFromResultsList : result){

                if(flightFromExpectedList.getDeparture().contains(flightFromResultsList.getDeparture())){
                    listaTrue.add(true);
                }

            }
        }
        assertEquals(listaTrue.size(), 3);
    }
}