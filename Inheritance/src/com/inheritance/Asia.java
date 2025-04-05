package com.inheritance;

public class Asia extends Continent {
    public Asia() {
        System.out.println("Running no-arg constructor of Asia");
    }

    @Override
    public void name() {
        System.out.println("Continent: Asia");
    }

    @Override
    public void area() {
        System.out.println("Asia is the largest continent by area");
    }

    @Override
    public void population() {
        System.out.println("Asia has the highest population");
    }

    @Override
    public void climate() {
        System.out.println("Asia has a variety of climates: tropical, arid, temperate, and polar");
    }

    @Override
    public void countries() {
        System.out.println("Asia has countries like India, China, Japan, etc.");
    }
}
