package com.inheritance;

public class Painting extends Art {
    public Painting() {
        System.out.println("Running no-arg constructor of Painting");
    }

    @Override
    public void create() {
        System.out.println("Painting with brushes and colors");
    }

    @Override
    public void display() {
        System.out.println("Hanging painting on the wall");
    }

    @Override
    public void inspire() {
        System.out.println("Painting inspires imagination");
    }

    @Override
    public void sell() {
        System.out.println("Selling the painting at auction");
    }

    @Override
    public void preserve() {
        System.out.println("Framing and storing painting safely");
    }

    public void destroy() {
        System.out.println("destroy the painting safely");
    }
}
