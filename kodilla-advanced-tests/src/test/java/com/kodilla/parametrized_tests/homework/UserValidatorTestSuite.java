package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"abC", "Xyz", "123","._-abc" })
    public void ShouldReturnTrueWhenTheUserNameIsCorrect(String username){
        assertTrue(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @ValueSource(strings = {"av", "XZ", "12", "!abc", "@abc", "#abc", "$abc", "%abc", "^abc", "&abc", "*abc", "(abc", ")abc"})
    public void ShouldReturnFalseWhenTheUsernameIsNotCorrect(String username){
        assertFalse(userValidator.validateUsername(username));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void ShouldReturnFalseWhenTheUsernameIsNullOrEmpty(String value){
        assertFalse(userValidator.validateUsername(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a@a.com", "A@A.org", "1@1.io", "_-@-.de", "a-a@a-a.com", "1.1@1.1.io"})
    public void ShouldReturnTrueWhenTheEmailIsOk(String value){
        assertTrue(userValidator.validateEmail(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", " ", "a.com", "a@a", "!@aa.io", "aa@%.com"})
    public void ShouldReturnFalseWhenTheEmailIsNotOk(String value){
        assertFalse(userValidator.validateEmail(value));
    }

    @ParameterizedTest
    @ValueSource(strings = { "Anna1", "Katarzyna2", "anna_1", "katarzyna1", "katarzyna.anna"})
    public void validateUsername(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"anna@mail.pl", "katarzyna@mail.pl", "anna1@mail.com", "katarzyna1@mail.com", "katarzyna.anna@mail.com"})
    public void validateEmail(String email) {
        boolean result = userValidator.validateEmail(email);
        assertTrue(result);
    }
}