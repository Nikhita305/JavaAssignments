package com.inheritance;

public class Kannada extends Language {
    public Kannada() {
        System.out.println("Running no-arg constructor of Kannada");
    }

    @Override
    public void name() {
        System.out.println("Kannada is the official language of Karnataka");
    }

    @Override
    public void origin() {
        System.out.println("Kannada originated from the Dravidian language family");
    }

    @Override
    public void script() {
        System.out.println("Kannada uses the Kannada script");
    }

    @Override
    public void speakers() {
        System.out.println("Spoken by over 40 million people");
    }

    @Override
    public void importance() {
        System.out.println("Kannada reflects rich culture and literature");
    }

    public void poets() {
        System.out.println("Kannada has famous poets like Kuvempu and Bendre");
    }

}
