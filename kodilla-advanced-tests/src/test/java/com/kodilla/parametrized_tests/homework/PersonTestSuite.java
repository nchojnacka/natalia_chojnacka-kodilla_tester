package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class PersonTestSuite {

    @ParameterizedTest
    @ValueSource(doubles = {60.6, 50.1, 100.00, 90.99})
    public void shouldGetBMI(double height, double weight, String expected) {
        Person person = new Person(height, weight);
        assertEquals(expected, person.getBMI());
    }
}