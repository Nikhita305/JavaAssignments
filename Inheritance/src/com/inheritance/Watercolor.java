package com.inheritance;

public class Watercolor extends Paint {
    public Watercolor() {
        System.out.println("Running no-arg constructor of Watercolor");
    }

    @Override
    public void name() {
        System.out.println("Paint: Watercolor 🎨");
    }

    @Override
    public void type() {
        System.out.println("Watercolor is a transparent water-based paint");
    }

    @Override
    public void use() {
        System.out.println("Watercolor is used for delicate and artistic painting");
    }

    @Override
    public void dryTime() {
        System.out.println("Watercolors dry quickly in minutes");
    }

    @Override
    public void base() {
        System.out.println("Watercolor is water-based and easy to clean");
    }
}
