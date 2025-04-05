package com.inheritance;

public class Purple extends Color {
    public Purple() {
        System.out.println("Running no-arg constructor of Purple");
    }

    @Override
    public void name() {
        System.out.println("The color is Purple");
    }

    @Override
    public void wavelength() {
        System.out.println("Purple has a wavelength around 380–450 nm");
    }

    @Override
    public void emotion() {
        System.out.println("Purple often represents royalty, luxury, and wisdom");
    }

    @Override
    public void usedIn() {
        System.out.println("Purple is popular in fashion, branding, and interior design");
    }

    @Override
    public void combination() {
        System.out.println("Purple is made by mixing red and blue");
    }
}
