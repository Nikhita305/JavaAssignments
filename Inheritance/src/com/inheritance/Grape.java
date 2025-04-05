package com.inheritance;

public class Grape extends Fruit {
    public Grape() {
        System.out.println("Running no-arg constructor of Grape");
    }

    @Override
    public void taste() {
        System.out.println("Grapes are sweet and tangy");
    }

    @Override
    public void color() {
        System.out.println("Grapes are usually green or purple");
    }

    @Override
    public void shape() {
        System.out.println("Grapes are small and round");
    }

    @Override
    public void season() {
        System.out.println("Grapes are available mostly in summer");
    }

    @Override
    public void benefits() {
        System.out.println("Grapes are rich in antioxidants");
    }
}
