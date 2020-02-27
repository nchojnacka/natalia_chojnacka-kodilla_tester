package com.kodilla.stream;

public class AverageAge {
    public static void main(String[] args) {
        UserRepository.getUsersList()
                .stream()
                .map(u -> u.getAge())
                .mapToInt(n-> n)
                .average()
                .getAsDouble();
        System.out.println();
//        System.out.println(avg);
    }
}
