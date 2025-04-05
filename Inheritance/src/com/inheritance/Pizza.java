package com.inheritance;

public class Pizza extends Food {
    public Pizza() {
        System.out.println("Running no-arg constructor of Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing pizza dough and toppings");
    }

    @Override
    public void cook() {
        System.out.println("Baking pizza in the oven");
    }

    @Override
    public void serve() {
        System.out.println("Serving hot pizza slices");
    }

    @Override
    public void eat() {
        System.out.println("Eating cheesy pizza");
    }

    @Override
    public void cleanUp() {
        System.out.println("Cleaning the pizza tray and dishes");
    }
}
