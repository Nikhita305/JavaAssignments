package com.inheritance;

public class Lollipop extends Candy {
    public Lollipop() {
        System.out.println("Running no-arg constructor of Lollipop");
    }

    @Override
    public void name() {
        System.out.println("Candy: Lollipop 🍭");
    }

    @Override
    public void flavor() {
        System.out.println("Lollipops come in strawberry, mango, orange, and more");
    }

    @Override
    public void sweetness() {
        System.out.println("Lollipops are super sweet and fun to lick");
    }

    @Override
    public void color() {
        System.out.println("Lollipops are usually red, pink, yellow, or rainbow colored");
    }

    @Override
    public void pack() {
        System.out.println("Lollipops are wrapped with a clear plastic and a twisty stick");
    }
}
