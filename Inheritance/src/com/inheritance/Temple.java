package com.inheritance;

public class Temple extends Building {
    public Temple() {
        System.out.println("Running no-arg constructor of Temple");
    }

    @Override
    public void construct() {
        System.out.println("Temple is constructed with spiritual architecture");
    }

    @Override
    public void open() {
        System.out.println("Temple opens early for devotees");
    }

    @Override
    public void renovate() {
        System.out.println("Temple is being renovated with traditional designs");
    }

    @Override
    public void clean() {
        System.out.println("Temple is cleaned daily by volunteers");
    }

    @Override
    public void lock() {
        System.out.println("Temple gates are locked after prayer hours");
    }
    public void pray() {
        System.out.println("Devotees are praying inside the temple");
    }

}
