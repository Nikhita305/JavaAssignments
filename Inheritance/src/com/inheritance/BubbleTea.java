package com.inheritance;

public class BubbleTea extends Beverage {
    public BubbleTea() {
        System.out.println("Running no-arg constructor of BubbleTea");
    }

    @Override
    public void name() {
        System.out.println("This beverage is Bubble Tea");
    }

    @Override
    public void temperature() {
        System.out.println("Bubble Tea is mostly served cold with ice");
    }

    @Override
    public void ingredients() {
        System.out.println("It includes milk, tea, and chewy tapioca pearls");
    }

    @Override
    public void taste() {
        System.out.println("Bubble Tea is sweet and creamy");
    }

    @Override
    public void occasion() {
        System.out.println("Popular as a trendy drink for hangouts");
    }
}
