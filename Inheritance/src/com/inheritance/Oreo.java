package com.inheritance;

public class Oreo extends Biscuit {
    public Oreo() {
        System.out.println("Running no-arg constructor of Oreo");
    }

    @Override
    public void name() {
        System.out.println("Biscuit: Oreo");
    }

    @Override
    public void taste() {
        System.out.println("Oreo has a sweet chocolatey taste with creamy filling");
    }

    @Override
    public void texture() {
        System.out.println("Oreo is crunchy on the outside and creamy inside");
    }

    @Override
    public void shape() {
        System.out.println("Oreo is perfectly round with a patterned top");
    }

    @Override
    public void serve() {
        System.out.println("Oreo is best served with a glass of cold milk 🥛");
    }
}
