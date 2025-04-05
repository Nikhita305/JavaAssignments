package com.inheritance;

public class Gemstone extends Stone {
    public Gemstone() {
        System.out.println("💎 Gemstone constructor called");
    }

    @Override
    public void origin() {
        System.out.println("Formed under high pressure deep inside the Earth.");
    }

    @Override
    public void weight() {
        System.out.println("Usually light and measured in carats.");
    }

    @Override
    public void texture() {
        System.out.println("Smooth and polished surface.");
    }

    @Override
    public void color() {
        System.out.println("Vibrant colors like red, blue, green, etc.");
    }

    @Override
    public void usage() {
        System.out.println("Used in jewelry and decoration.");
    }
}
