package com.inheritance;

public class Wool extends Fabric {
    public Wool() {
        System.out.println("🧶 Wool is being spun...");
    }

    @Override
    public void name() {
        System.out.println("Fabric: Wool");
    }

    @Override
    public void source() {
        System.out.println("Obtained from the fleece of sheep.");
    }

    @Override
    public void texture() {
        System.out.println("Soft, warm, and slightly fuzzy.");
    }

    @Override
    public void use() {
        System.out.println("Used in sweaters, blankets, scarves, and coats.");
    }

    @Override
    public void care() {
        System.out.println("Hand wash or dry clean to maintain softness.");
    }
}
