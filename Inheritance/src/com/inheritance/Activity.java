package com.inheritance;

public class Activity {
    public Activity() {
        System.out.println("Activity constructor called");
    }

    public void start() {
        System.out.println("Starting the activity...");
    }

    public void perform() {
        System.out.println("Performing the activity...");
    }

    public void benefit() {
        System.out.println("Every activity offers some benefit.");
    }

    public void duration() {
        System.out.println("Activity duration may vary.");
    }

    public void end() {
        System.out.println("Ending the activity gracefully.");
    }
}
