package com.inheritance;

public class Redmi extends Mobile {
    public Redmi() {
        System.out.println("Running no-arg constructor of Redmi");
    }

    @Override
    public void brand() {
        System.out.println("This mobile is Redmi");
    }

    @Override
    public void features() {
        System.out.println("Redmi offers MIUI, dual SIM, and fast charging");
    }

    @Override
    public void battery() {
        System.out.println("Redmi phones have high-capacity Li-ion batteries");
    }

    @Override
    public void camera() {
        System.out.println("Redmi comes with AI-powered cameras");
    }

    @Override
    public void storage() {
        System.out.println("Redmi supports expandable storage up to 1TB");
    }
}
