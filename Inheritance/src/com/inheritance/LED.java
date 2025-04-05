package com.inheritance;

public class LED extends Light {
    public LED() {
        System.out.println("Running no-arg constructor of LED");
    }

    @Override
    public void type() {
        System.out.println("This is an LED light");
    }

    @Override
    public void powerConsumption() {
        System.out.println("LEDs consume very low power compared to traditional bulbs");
    }

    @Override
    public void color() {
        System.out.println("LEDs are available in cool white, warm white, and RGB colors");
    }

    @Override
    public void usage() {
        System.out.println("LEDs are used in homes, streets, screens, and decorations");
    }

    @Override
    public void lifetime() {
        System.out.println("LEDs have a long lifetime, often over 25,000 hours");
    }
}
