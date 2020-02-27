package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Task {
    private String name;
    private LocalDate opened;
    private LocalDate deadLine;

    public Task(String name, LocalDate opened, LocalDate deadLine) {
        this.name = name;
        this.opened = opened;
        this.deadLine = deadLine;
    }

    public String getName() {
        return name;
    }

    public LocalDate getOpened() {
        return opened;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;
        Task task = (Task) o;
        return getName().equals(task.getName()) &&
                getOpened().equals(task.getOpened()) &&
                getDeadLine().equals(task.getDeadLine());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getOpened(), getDeadLine());
    }
}
