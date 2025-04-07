package com.inheritance;

public class RollerCoaster extends Ride {
    public RollerCoaster() {
        System.out.println("Running no-arg constructor of RollerCoaster");
    }

    @Override
    public void name() {
        System.out.println("This is a Roller Coaster ride!");
    }

    @Override
    public void speed() {
        System.out.println("Roller coasters go super fast!");
    }

    @Override
    public void duration() {
        System.out.println("Usually lasts around 2 to 3 minutes");
    }

    @Override
    public void thrillLevel() {
        System.out.println("Thrill level: EXTREME!");
    }

    @Override
    public void safety() {
        System.out.println("Make sure the harness is locked tight!");
    }

    public void loopCount() {
        System.out.println("This Roller Coaster has 5 loops!");
    }

}
