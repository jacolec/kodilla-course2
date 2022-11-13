package com.kodilla.patterns2.observer.homework;

public class Mentor implements TaskObserver {

    private final String name;
    private int taskCount;

    public Mentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTaskCount() {
        return taskCount;
    }

    @Override
    public void update(Homework homework) {
        System.out.println(name + ": New tasks to check in " + homework.getName() + "\n" +
                "(added to queue: " + homework.getTasks().size() + " tasks)");
        taskCount++;
    }
}
