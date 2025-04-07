package com.inheritance;

public class Startup extends Company {
    public Startup() {
        System.out.println("Running no-arg constructor of Startup");
    }

    @Override
    public void register() {
        System.out.println("Startup is registered as a private limited entity");
    }

    @Override
    public void hire() {
        System.out.println("Startup hires a small team of innovators");
    }

    @Override
    public void operate() {
        System.out.println("Startup operates with limited funding");
    }

    @Override
    public void grow() {
        System.out.println("Startup grows rapidly with innovation");
    }

    @Override
    public void payTaxes() {
        System.out.println("Startup enjoys tax benefits for first few years");
    }

    public void fire() {
        System.out.println("fire employees");
    }
}
