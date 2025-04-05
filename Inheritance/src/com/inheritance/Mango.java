package com.inheritance;

public class Mango extends Juice {
    public Mango() {
        System.out.println("Running no-arg constructor of Mango");
    }

    @Override
    public void name() {
        System.out.println("This juice is Mango Juice");
    }

    @Override
    public void fruitUsed() {
        System.out.println("Made from ripe, juicy mangoes");
    }

    @Override
    public void taste() {
        System.out.println("Sweet and rich in flavor");
    }

    @Override
    public void temperature() {
        System.out.println("Best served chilled!");
    }

    @Override
    public void benefit() {
        System.out.println("Great source of Vitamin A and antioxidants");
    }
}
