package com.kodilla.patterns.factory.tasks;

public final class ShopppingTask implements Task {

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;

    public ShopppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String executeTask() {
        return "Shopping list is ready";
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        boolean exec = true;
        if (exec) {
            System.out.println("Task executed!");
        } else {
            System.out.println("Task execution failed!");
        }
        return exec;
    }

    public String getWhatToBuy() {
        return whatToBuy;
    }

    public double getQuantity() {
        return quantity;
    }
}
