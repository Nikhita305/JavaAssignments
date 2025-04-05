package com.inheritance;

public class Item {
    public Item() {
        System.out.println("Running no-arg constructor of Item");
    }

    public void type() {
        System.out.println("This is a general item");
    }

    public void material() {
        System.out.println("Items can be made from various materials");
    }

    public void usage() {
        System.out.println("Items are used in daily life");
    }

    public void color() {
        System.out.println("Items come in different colors");
    }

    public void cost() {
        System.out.println("Cost of items depends on quality and type");
    }
}
