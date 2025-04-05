package com.inheritance;

public class Ghost extends Spirit {
    public Ghost() {
        System.out.println("Ghost has entered the scene...");
    }

    @Override
    public void appear() {
        System.out.println("The ghost suddenly appears with a chilling breeze!");
    }

    @Override
    public void vanish() {
        System.out.println("The ghost disappears into the shadows...");
    }

    @Override
    public void haunt() {
        System.out.println("The ghost haunts your dreams");
    }

    @Override
    public void whisper() {
        System.out.println("Ghost whispers: 'I'm right behind you.");
    }

    @Override
    public void floatAround() {
        System.out.println("Ghost floats through walls effortlessly.");
    }
}
