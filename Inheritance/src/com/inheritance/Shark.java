package com.inheritance;

public class Shark extends Fish {
    public Shark() {
        System.out.println("🦈 Shark class created...");
    }

    @Override
    public void name() {
        System.out.println("Fish: Shark");
    }

    @Override
    public void habitat() {
        System.out.println("Lives in oceans across the world.");
    }

    @Override
    public void swim() {
        System.out.println("Swims powerfully and swiftly.");
    }

    @Override
    public void breathe() {
        System.out.println("Breathes using gills and needs water flow.");
    }

    @Override
    public void eat() {
        System.out.println("Carnivorous — eats fish, seals, and more.");
    }
}
