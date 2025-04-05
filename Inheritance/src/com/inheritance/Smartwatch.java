package com.inheritance;

public class Smartwatch extends Gadget {
    public Smartwatch() {
        System.out.println("Running no-arg constructor of Smartwatch");
    }

    @Override
    public void name() {
        System.out.println("This is a Smartwatch");
    }

    @Override
    public void purpose() {
        System.out.println("Used to track health, show notifications, and tell time");
    }

    @Override
    public void batteryLife() {
        System.out.println("Smartwatches usually last 1-7 days on a full charge");
    }

    @Override
    public void portability() {
        System.out.println("Worn on the wrist, extremely portable");
    }

    @Override
    public void priceRange() {
        System.out.println("Smartwatches range from ₹1,000 to ₹50,000+ depending on brand");
    }
}
