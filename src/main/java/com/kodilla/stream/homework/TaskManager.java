package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {

    public static void main(String[] args) {
        List<LocalDate> tasks = TaskRepository.getTasks()
                .stream()
                .filter(t -> t.getDeadLine().isAfter(LocalDate.now()))
                .map(TaskManager::getDeadline)
                .collect(Collectors.toList());
        System.out.println(tasks);
    }
    public static LocalDate getDeadline (Task task) {
        return task.getDeadLine();
    }
}
