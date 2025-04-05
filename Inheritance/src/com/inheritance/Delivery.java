package com.inheritance;

public class Delivery extends Package {
    public Delivery() {
        System.out.println("Running no-arg constructor of Delivery");
    }

    @Override
    public void weight() {
        System.out.println("Delivery package weighs 2.5 kg");
    }

    @Override
    public void size() {
        System.out.println("Delivery package is medium-sized");
    }

    @Override
    public void content() {
        System.out.println("Delivery contains electronic gadgets");
    }

    @Override
    public void label() {
        System.out.println("Delivery label includes address and tracking ID");
    }

    @Override
    public void fragile() {
        System.out.println("Delivery is marked as fragile - handle with care");
    }
}
