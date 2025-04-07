package com.inheritance;

public class Samosa extends Snack {
    public Samosa() {
        System.out.println("Running no-arg constructor of Samosa");
    }

    @Override
    public void name() {
        System.out.println("This snack is Samosa ");
    }

    @Override
    public void type() {
        System.out.println("Samosa is a deep-fried savory snack");
    }

    @Override
    public void ingredients() {
        System.out.println("Stuffed with spicy potatoes, peas, and sometimes meat");
    }

    @Override
    public void served() {
        System.out.println("Best served hot with chutney");
    }

    @Override
    public void popularity() {
        System.out.println("Samosa is loved across India and beyond!");
    }

    public void crispiness() {
        System.out.println("Samosa is crispy and golden brown!");
    }

}
