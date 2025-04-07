package com.inheritance;

public class Teddy extends Toy {
    public Teddy() {
        System.out.println("Running no-arg constructor of Teddy");
    }

    @Override
    public void name() {
        System.out.println("This toy is a Teddy bear");
    }

    @Override
    public void material() {
        System.out.println("Teddy is made of soft fur and stuffing");
    }

    @Override
    public void color() {
        System.out.println("Teddies are usually brown, white, or pink");
    }

    @Override
    public void purpose() {
        System.out.println("Teddy bears provide comfort and companionship");
    }

    @Override
    public void ageGroup() {
        System.out.println("Teddies are popular among kids and even adults");
    }

    public void hug() {
        System.out.println("Teddy bear is soft and huggable");
    }

}
