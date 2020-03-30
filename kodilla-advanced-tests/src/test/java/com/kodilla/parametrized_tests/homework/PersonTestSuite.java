package com.kodilla.parametrized_tests.homework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.DataBMI#dataProviderForTestingBmi")
    public void shouldGetBMI(Person person) {

        assertEquals(person.description, person.getBMI());
    }
}