package com.inheritance;

public class Kurti extends Outfit {
    public Kurti() {
        System.out.println("Running no-arg constructor of Kurti");
    }

    @Override
    public void name() {
        System.out.println("Outfit: Kurti 👗");
    }

    @Override
    public void fabric() {
        System.out.println("Kurtis are usually made from cotton, rayon, or silk");
    }

    @Override
    public void occasion() {
        System.out.println("Can be worn casually or for traditional events");
    }

    @Override
    public void comfortLevel() {
        System.out.println("Kurtis are known for comfort and elegance");
    }

    @Override
    public void trend() {
        System.out.println("Straight-cut, A-line, and frock-style are trending");
    }
}
