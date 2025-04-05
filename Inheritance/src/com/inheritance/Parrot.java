package com.inheritance;

public class Parrot extends Bird {
    public Parrot() {
        System.out.println("Running no-arg constructor of Parrot");
    }

    @Override
    public void fly() {
        System.out.println("Parrot flies gracefully in the sky");
    }

    @Override
    public void sing() {
        System.out.println("Parrot mimics human speech and sings");
    }

    @Override
    public void buildNest() {
        System.out.println("Parrot builds nests on tree branches");
    }

    @Override
    public void eat() {
        System.out.println("Parrot eats fruits, seeds, and nuts");
    }

    @Override
    public void migrate() {
        System.out.println("Parrots usually stay in warm places and don’t migrate much");
    }
}
