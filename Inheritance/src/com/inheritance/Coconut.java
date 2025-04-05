package com.inheritance;

public class Coconut extends Tree {
    public Coconut() {
        System.out.println("Running no-arg constructor of Coconut");
    }

    @Override
    public void type() {
        System.out.println("Coconut is a tropical palm tree");
    }

    @Override
    public void height() {
        System.out.println("Coconut trees can grow up to 30 meters tall");
    }

    @Override
    public void leaves() {
        System.out.println("Coconut trees have long feather-like leaves");
    }

    @Override
    public void benefits() {
        System.out.println("Coconuts provide water, oil, coir, and food");
    }

    @Override
    public void lifespan() {
        System.out.println("Coconut trees can live for around 60–80 years");
    }
}
