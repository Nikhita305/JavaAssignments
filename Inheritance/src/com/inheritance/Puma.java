package com.inheritance;

public class Puma extends Shoe {
    public Puma() {
        System.out.println("Running no-arg constructor of Puma");
    }

    @Override
    public void brand() {
        System.out.println("This is a Puma branded shoe");
    }

    @Override
    public void size() {
        System.out.println("Puma shoes are available from size 5 to 12");
    }

    @Override
    public void type() {
        System.out.println("Puma offers sports, running, and casual shoes");
    }

    @Override
    public void material() {
        System.out.println("Puma uses mesh, synthetic, and rubber materials");
    }

    @Override
    public void price() {
        System.out.println("Puma shoes range from ₹1500 to ₹7000");
    }
}
