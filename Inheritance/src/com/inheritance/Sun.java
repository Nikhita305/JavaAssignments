package com.inheritance;

public class Sun extends Star {
    public Sun() {
        System.out.println("Running no-arg constructor of Sun");
    }

    @Override
    public void name() {
        System.out.println("This is the Sun - the star at the center of our solar system");
    }

    @Override
    public void temperature() {
        System.out.println("The Sun's surface temperature is about 5,500°C");
    }

    @Override
    public void size() {
        System.out.println("The Sun is a medium-sized yellow dwarf star");
    }

    @Override
    public void light() {
        System.out.println("The Sun provides light and heat to Earth");
    }

    @Override
    public void position() {
        System.out.println("The Sun is at the center of our solar system");
    }
}
