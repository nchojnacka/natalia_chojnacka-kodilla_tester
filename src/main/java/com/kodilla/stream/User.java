package com.kodilla.stream;

import java.util.Objects;

public class User {
    private String username;
    private int age;
    private int numberOfPosts;
    private String group;

    public User(String username, int age, int numberOfPosts, String group){
        this.username = username;
        this.age = age;
        this.numberOfPosts = numberOfPosts;
        this.group = group;
    }

    String getUsername(){return username;}
    int getAge(){return age;}
    int getNumberOfPosts(){return numberOfPosts;}
    String getGroup(){return group;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                numberOfPosts == user.numberOfPosts &&
                username.equals(user.username) &&
                group.equals(user.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, age, numberOfPosts, group);
    }
}
