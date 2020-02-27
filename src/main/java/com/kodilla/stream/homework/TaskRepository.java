package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("do homework", LocalDate.of(2020, 2, 27), LocalDate.of(2020, 2, 29)));
        tasks.add(new Task("do homework", LocalDate.of(2020, 1, 27), LocalDate.of(2020, 1, 29)));
        tasks.add(new Task("do homework", LocalDate.of(2020, 2, 20), LocalDate.of(2020, 2, 21)));
        tasks.add(new Task("do homework", LocalDate.of(2020, 1, 10), LocalDate.of(2020, 1, 30)));
        return tasks;
    }

}
