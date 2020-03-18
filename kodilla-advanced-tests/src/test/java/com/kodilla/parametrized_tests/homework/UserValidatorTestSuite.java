package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = { "Anna1", "Katarzyna2", "anna_1", "katarzyna*1", "katarzyna.anna"})
    public void validateUsername(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"anna1@mail.pl", "katarzyna2@mail.pl", "anna1@mail.com", "katarzyna*1@mail.com", "katarzyna.anna@mail.com"})
    public void validateEmail(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }
}