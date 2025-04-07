package com.inheritance;

public class Coffee extends Drink {
    public Coffee() {
        System.out.println("Running no-arg constructor of Coffee");
    }

    @Override
    public void prepare() {
        System.out.println("Brewing coffee with hot water and coffee powder");
    }

    @Override
    public void serve() {
        System.out.println("Serving hot coffee in a cup");
    }

    @Override
    public void taste() {
        System.out.println("Coffee tastes rich and strong");
    }

    @Override
    public void temperature() {
        System.out.println("Coffee is served hot");
    }

    @Override
    public void pack() {
        System.out.println("Packing coffee in a thermos");
    }

    public void unPack() {
        System.out.println("Unacking coffee in a thermos");
    }
}
