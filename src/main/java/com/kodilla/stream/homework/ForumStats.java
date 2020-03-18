package com.kodilla.stream.homework;

import com.kodilla.stream.UserRepository;

public class ForumStats {

    public static void main(String[] args) {

        UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() >= 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(n -> n).average()
                .ifPresent(u -> System.out.println(u));

        UserRepository.getUsersList()
                .stream()
                .filter(u -> u.getAge() < 40)
                .map(u -> u.getNumberOfPosts())
                .mapToInt(u -> u).average()
                .ifPresent(u -> System.out.println(u));
    }

}
