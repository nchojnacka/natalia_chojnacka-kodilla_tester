package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map<Principal,School> schoolPrincipal=new HashMap<>();

        Principal primarySchoolPrincipal=new Principal("Jan Kowalski");
        Principal highSchoolPrincipal=new Principal("Adam Malinowski");
        Principal vocationalSchoolPrincipal=new Principal("Anna Nowak");

        School firstSchool=new School("primary school",15,16,14,15,15,14);
        School secondSchool=new School("high school",20,25,31,30,25);
        School thirdSchool=new School("vocational school",19,18,21,20,21,21,18);

        schoolPrincipal.put(primarySchoolPrincipal,firstSchool);
        schoolPrincipal.put(highSchoolPrincipal,secondSchool);
        schoolPrincipal.put(vocationalSchoolPrincipal,thirdSchool);

        for(Map.Entry<Principal,School> schoolPrincipalEntry:schoolPrincipal.entrySet()){
            System.out.println(schoolPrincipalEntry.getKey().getNameAndSurname()+", "+ schoolPrincipalEntry.getValue().getName()+", "+"amount of students: "+schoolPrincipalEntry.getValue().getSumOfStudents());
        }
    }
}
