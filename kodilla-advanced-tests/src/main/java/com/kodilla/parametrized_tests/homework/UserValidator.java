package com.kodilla.parametrized_tests.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {

    public boolean validateUsername(String username) {
        if (username != null) {
            return username.matches("^[a-zA-Z0-9._-]{3,}$");
        }
        return false;
    }

    public boolean validateEmail(String email) {
        if (null != email) {
            return email.matches("^([_a-zA-Z0-9-]+(\\.[_a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*(\\.[a-zA-Z]{1,6}))?$");
        }
        return false;
    }

}
