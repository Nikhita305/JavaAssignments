package com.inheritance;

public class Sofa extends Furniture {
    public Sofa() {
        System.out.println("Running no-arg constructor of Sofa");
    }

    @Override
    public void type() {
        System.out.println("This is a Sofa - a seating furniture");
    }

    @Override
    public void material() {
        System.out.println("Made of wood frame, cushions, and fabric or leather");
    }

    @Override
    public void usage() {
        System.out.println("Used for sitting, lounging, or sleeping");
    }

    @Override
    public void weight() {
        System.out.println("Usually heavy due to wood and padding");
    }

    @Override
    public void price() {
        System.out.println("Price can range from ₹5,000 to ₹1,00,000+");
    }
}
