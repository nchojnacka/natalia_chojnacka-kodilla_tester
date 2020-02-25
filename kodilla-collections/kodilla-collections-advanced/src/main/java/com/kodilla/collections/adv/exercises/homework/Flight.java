package com.kodilla.collections.adv.exercises.homework;

public class Flight {

    String departure;
    String arrival;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;
        Flight flight = (Flight) o;
        return getDeparture().equals(flight.getDeparture()) &&
                getArrival().equals(flight.getArrival());
    }

    @Override
    public String toString() {
        return "Flight{" +
                "departure='" + departure + '\'' + ", arrival='" + arrival + '\'' + '}';
    }
}
