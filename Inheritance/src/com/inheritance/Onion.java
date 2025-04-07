package com.inheritance;

public class Onion extends Vegetable {
    public Onion() {
        System.out.println("Running no-arg constructor of Onion");
    }

    @Override
    public void name() {
        System.out.println("This is an onion");
    }

    @Override
    public void color() {
        System.out.println("Onions are usually red, white, or yellow");
    }

    @Override
    public void taste() {
        System.out.println("Onions have a sharp and spicy taste");
    }

    @Override
    public void nutrients() {
        System.out.println("Onions contain antioxidants and vitamin C");
    }

    @Override
    public void season() {
        System.out.println("Onions are grown year-round in many regions");
    }

    public void peel() {
        System.out.println("Onion needs to be peeled before cooking");
    }

}
