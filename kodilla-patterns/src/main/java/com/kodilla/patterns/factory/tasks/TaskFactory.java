package com.kodilla.patterns.factory.tasks;

public final class TaskFactory {

    public static final String SHOP = "SHOP";
    public static final String PAINT = "PAINT";
    public static final String DRIVE = "DRIVE";

    public final Task doTask(final String taskClass) {
        switch (taskClass) {
            case SHOP:
                return new ShopppingTask("Buy", "tomato", 4);
            case PAINT:
                return new PaintingTask("Paint", "red", "flower");
            case DRIVE:
                return new DrivingTask("Drive", "city center", "car");
            default:
                return null;
        }
    }


}
