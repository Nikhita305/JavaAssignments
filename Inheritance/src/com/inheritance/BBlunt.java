package com.inheritance;

public class BBlunt extends Shampoo {
    public BBlunt() {
        System.out.println("Running no-arg constructor of BBlunt");
    }

    @Override
    public void apply() {
        System.out.println("Applying BBlunt shampoo for smooth hair");
    }

    @Override
    public void rinse() {
        System.out.println("Rinsing BBlunt shampoo thoroughly");
    }

    @Override
    public void foam() {
        System.out.println("BBlunt shampoo forms rich foam");
    }

    @Override
    public void fragrance() {
        System.out.println("BBlunt has a long-lasting fragrance");
    }

    @Override
    public void pack() {
        System.out.println("Packing BBlunt in a premium bottle");
    }

    public void unPack() {
        System.out.println("Unpacking BBlunt in a premium bottle");
    }
}
