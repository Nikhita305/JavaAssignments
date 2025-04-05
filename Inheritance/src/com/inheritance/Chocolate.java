package com.inheritance;

public class Chocolate extends Sweet {
    public Chocolate() {
        System.out.println("Running no-arg constructor of Chocolate");
    }

    @Override
    public void name() {
        System.out.println("This sweet is Chocolate");
    }

    @Override
    public void flavor() {
        System.out.println("Chocolate has a rich cocoa flavor");
    }

    @Override
    public void madeOf() {
        System.out.println("Made of cocoa, sugar, and milk");
    }

    @Override
    public void color() {
        System.out.println("Usually brown or dark brown in color");
    }

    @Override
    public void occasion() {
        System.out.println("Chocolate is popular on birthdays, Valentine's, and more");
    }
}
