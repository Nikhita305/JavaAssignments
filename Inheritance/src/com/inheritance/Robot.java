package com.inheritance;

public class Robot extends Machine {
    public Robot() {
        System.out.println("Running no-arg constructor of Robot");
    }

    @Override
    public void start() {
        System.out.println("Robot is powering up");
    }

    @Override
    public void stop() {
        System.out.println("Robot is shutting down");
    }

    @Override
    public void process() {
        System.out.println("Robot is executing programmed tasks");
    }

    @Override
    public void status() {
        System.out.println("Robot status: Online and Operational");
    }

    @Override
    public void maintain() {
        System.out.println("Running diagnostics and updating firmware");
    }

    public void clean() {
        System.out.println("Running clean");
    }
}
