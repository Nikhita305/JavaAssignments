package com.inheritance;

public class Karnataka extends State {
    public Karnataka() {
        System.out.println("Running no-arg constructor of Karnataka");
    }

    @Override
    public void name() {
        System.out.println("This state is Karnataka");
    }

    @Override
    public void language() {
        System.out.println("Kannada is the official language");
    }

    @Override
    public void capital() {
        System.out.println("Bengaluru is the capital city");
    }

    @Override
    public void famousFor() {
        System.out.println("Known for IT hubs, heritage sites, and nature");
    }

    @Override
    public void population() {
        System.out.println("Population is over 6 crore");
    }

    public void schemes() {
        System.out.println("Karnataka implements various development schemes");
    }

}
