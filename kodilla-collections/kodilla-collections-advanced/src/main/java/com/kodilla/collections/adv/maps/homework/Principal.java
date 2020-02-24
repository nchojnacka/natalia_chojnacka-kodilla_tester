package com.kodilla.collections.adv.maps.homework;

import java.util.Objects;

public class Principal {
    private String nameAndSurname;

    public Principal(String nameAndSurname) {
        this.nameAndSurname = nameAndSurname;
    }
    public String getNameAndSurname() {
        return nameAndSurname;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Principal principal = (Principal) o;
        return nameAndSurname.equals(principal.nameAndSurname);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nameAndSurname);
    }
    @Override
    public String toString() {
        return "Principal{" +
                "nameAndSurname='" + nameAndSurname + '\'' +
                '}';
    }
}
