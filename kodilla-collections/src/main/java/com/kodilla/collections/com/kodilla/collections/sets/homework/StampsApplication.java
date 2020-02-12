package com.kodilla.collections.com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {

    public static void main(String[] args) {

        Set<Stamp>stamps = new HashSet<>();

        stamps.add(new Stamp("stamp1", "10mmx10mm", "no"));
        stamps.add(new Stamp("stamp2", "20mmx20mm", "no"));
        stamps.add(new Stamp("stamp3", "30mmx30mm", "yes"));
        stamps.add(new Stamp("stamp4", "40mmx40mm", "yes"));
        stamps.add(new Stamp("stamp5", "50mmx50mm", "no"));


        System.out.println(stamps.size());
        for (Stamp stamp : stamps) {
            System.out.println(stamp);
        }
    }
}