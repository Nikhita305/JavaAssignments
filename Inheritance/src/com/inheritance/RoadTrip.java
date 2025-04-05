package com.inheritance;

public class RoadTrip extends Category {
    public RoadTrip() {
        System.out.println("RoadTrip constructor called");
    }

    @Override
    public void mode() {
        System.out.println("Traveling by car or bike through scenic routes.");
    }

    @Override
    public void destination() {
        System.out.println("Stopping at multiple exciting spots along the way.");
    }

    @Override
    public void budget() {
        System.out.println("Fuel, food, and accommodation form the main budget.");
    }

    @Override
    public void duration() {
        System.out.println("Usually 1 to 7 days of travel and exploration.");
    }

    @Override
    public void experience() {
        System.out.println("Filled with fun, bonding, music, and memories!");
    }
}
