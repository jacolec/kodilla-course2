package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Homework implements TaskObservable {

    private final List<String> tasks;
    private String name;
    private final List<TaskObserver> taskObservers;

    public Homework(String name) {
        this.name = name;
        tasks = new ArrayList<>();
        taskObservers = new ArrayList<>();
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyTaskObservers();
    }

    @Override
    public void registerTaskObserver(TaskObserver taskObserver) {
        taskObservers.add(taskObserver);
    }

    @Override
    public void notifyTaskObservers() {
        for (TaskObserver taskObserver: taskObservers) {
            taskObserver.update(this);
        }
    }

    @Override
    public void removeTaskObserver(TaskObserver taskObserver) {
        taskObservers.remove(taskObserver);
    }
}
