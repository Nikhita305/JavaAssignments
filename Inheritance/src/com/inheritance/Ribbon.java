package com.inheritance;

public class Ribbon extends Item {
    public Ribbon() {
        System.out.println("Running no-arg constructor of Ribbon");
    }

    @Override
    public void type() {
        System.out.println("This is a decorative Ribbon");
    }

    @Override
    public void material() {
        System.out.println("Ribbon is made of silk, satin, or fabric");
    }

    @Override
    public void usage() {
        System.out.println("Used for decoration, hair styling, and gift wrapping");
    }

    @Override
    public void color() {
        System.out.println("Ribbons come in vibrant colors and patterns");
    }

    @Override
    public void cost() {
        System.out.println("Ribbons are usually inexpensive");
    }
}
