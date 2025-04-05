package com.inheritance;

public class Superhero extends Character {
    public Superhero() {
        System.out.println("Running no-arg constructor of Superhero");
    }

    @Override
    public void name() {
        System.out.println("Superhero: Captain Blaze");
    }

    @Override
    public void role() {
        System.out.println("Fights crime and saves the world");
    }

    @Override
    public void origin() {
        System.out.println("Originated from a radioactive lab accident");
    }

    @Override
    public void strength() {
        System.out.println("Can fly and control fire");
    }

    @Override
    public void costume() {
        System.out.println("Wears a flame-resistant red suit");
    }
}
