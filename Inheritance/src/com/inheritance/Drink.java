package com.inheritance;

public class Drink {
    public Drink() {
        System.out.println("Running no-arg constructor of Drink");
    }

    public void prepare() {
        System.out.println("Preparing a drink");
    }

    public void serve() {
        System.out.println("Serving the drink");
    }

    public void taste() {
        System.out.println("Drink has a refreshing taste");
    }

    public void temperature() {
        System.out.println("Drink can be hot or cold");
    }

    public void pack() {
        System.out.println("Packing the drink");
    }
}
