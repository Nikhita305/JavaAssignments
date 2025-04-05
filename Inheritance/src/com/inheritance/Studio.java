package com.inheritance;

public class Studio extends Room {
    public Studio() {
        System.out.println("🎨 Welcome to the Studio space...");
    }

    @Override
    public void type() {
        System.out.println("Type: Studio Room - multipurpose creative space.");
    }

    @Override
    public void furniture() {
        System.out.println("Contains a work desk, cozy chair, art shelf, and bean bag.");
    }

    @Override
    public void lighting() {
        System.out.println("Uses warm fairy lights and natural sunlight.");
    }

    @Override
    public void decor() {
        System.out.println("Decorated with vinyls, sketches, plants, and mood boards.");
    }

    @Override
    public void use() {
        System.out.println("Used for music, painting, journaling, or just vibing.");
    }
}
