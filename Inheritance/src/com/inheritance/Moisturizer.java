package com.inheritance;

public class Moisturizer extends Lotion {
    public Moisturizer() {
        System.out.println("Running no-arg constructor of Moisturizer");
    }

    @Override
    public void apply() {
        System.out.println("Moisturizer hydrates dry skin effectively");
    }

    @Override
    public void fragrance() {
        System.out.println("Moisturizer is usually mild and fresh-scented");
    }

    @Override
    public void texture() {
        System.out.println("Moisturizer has a light and fast-absorbing texture");
    }

    @Override
    public void usageTime() {
        System.out.println("Use moisturizer after shower or before makeup");
    }

    @Override
    public void packaging() {
        System.out.println("Moisturizer often comes in eco-friendly jars");
    }
}
