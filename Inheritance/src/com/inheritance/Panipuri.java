package com.inheritance;

public class Panipuri extends Chaats {
    public Panipuri() {
        System.out.println("Running no-arg constructor of Panipuri");
    }

    @Override
    public void name() {
        System.out.println("This chaat is Panipuri ");
    }

    @Override
    public void ingredients() {
        System.out.println("It has crispy puris, spicy water, potato & chickpea stuffing");
    }

    @Override
    public void origin() {
        System.out.println("Popular across India, especially in Maharashtra & UP");
    }

    @Override
    public void taste() {
        System.out.println("Tangy, spicy, and absolutely mouth-watering!");
    }

    @Override
    public void served() {
        System.out.println("Served in rounds with chilled spicy water");
    }
}
