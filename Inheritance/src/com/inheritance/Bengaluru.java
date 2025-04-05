package com.inheritance;

public class Bengaluru extends City {
    public Bengaluru() {
        System.out.println("Running no-arg constructor of Bengaluru");
    }

    @Override
    public void name() {
        System.out.println("This city is Bengaluru");
    }

    @Override
    public void population() {
        System.out.println("Bengaluru has a population of over 8 million");
    }

    @Override
    public void famousFor() {
        System.out.println("Bengaluru is famous for IT industry and startups");
    }

    @Override
    public void climate() {
        System.out.println("Bengaluru has a moderate climate year-round");
    }

    @Override
    public void transportation() {
        System.out.println("Bengaluru has metro, buses, autos, and cabs");
    }
}
