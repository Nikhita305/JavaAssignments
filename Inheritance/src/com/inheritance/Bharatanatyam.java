package com.inheritance;

public class Bharatanatyam extends Dance {
    public Bharatanatyam() {
        System.out.println("🕉️ Bharatanatyam constructor called");
    }

    @Override
    public void rhythm() {
        System.out.println("Follows traditional Carnatic beats.");
    }

    @Override
    public void expression() {
        System.out.println("Uses 'abhinaya' to depict stories and emotions.");
    }

    @Override
    public void steps() {
        System.out.println("Has precise footwork and graceful mudras.");
    }

    @Override
    public void music() {
        System.out.println("Performed with classical Indian music.");
    }

    @Override
    public void purpose() {
        System.out.println("A devotional dance used for temple rituals and stage.");
    }
}
