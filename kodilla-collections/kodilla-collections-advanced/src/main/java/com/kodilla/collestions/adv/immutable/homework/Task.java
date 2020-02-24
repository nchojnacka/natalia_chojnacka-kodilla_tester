package com.kodilla.collestions.adv.immutable.homework;

public class Task {

    protected final String title;
    protected final int duration;

    public final String getTitle() {
        return title;
    }

    public final int getDuration() {
        return duration;
    }

    public Task(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
}
