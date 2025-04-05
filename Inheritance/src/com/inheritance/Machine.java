package com.inheritance;

public class Machine {
    public Machine() {
        System.out.println("Running no-arg constructor of Machine");
    }

    public void start() {
        System.out.println("Machine is starting");
    }

    public void stop() {
        System.out.println("Machine is stopping");
    }

    public void process() {
        System.out.println("Machine is processing task");
    }

    public void status() {
        System.out.println("Machine status: Active");
    }

    public void maintain() {
        System.out.println("Performing machine maintenance");
    }
}
