package com.inheritance;

public class Thermos extends Bottle {
    public Thermos() {
        System.out.println("Running no-arg constructor of Thermos");
    }

    @Override
    public void type() {
        System.out.println("This is a Thermos bottle");
    }

    @Override
    public void material() {
        System.out.println("Thermos bottles are usually made of stainless steel");
    }

    @Override
    public void capacity() {
        System.out.println("Thermos bottles usually range from 500ml to 1.5L");
    }

    @Override
    public void use() {
        System.out.println("Used to keep liquids hot or cold for long hours");
    }

    @Override
    public void color() {
        System.out.println("Thermos bottles often come in metallic or matte colors");
    }
}
