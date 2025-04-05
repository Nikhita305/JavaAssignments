package com.inheritance;

public class IceCream extends Dessert {
    public IceCream() {
        System.out.println("Running no-arg constructor of IceCream");
    }

    @Override
    public void name() {
        System.out.println("This dessert is Ice Cream");
    }

    @Override
    public void sweetnessLevel() {
        System.out.println("Ice Cream is very sweet and creamy");
    }

    @Override
    public void temperature() {
        System.out.println("Ice Cream is served cold or frozen");
    }

    @Override
    public void madeOf() {
        System.out.println("Made with milk, sugar, and flavors");
    }

    @Override
    public void servedOn() {
        System.out.println("Usually served in a cone, cup, or with desserts");
    }
}
