package com.inheritance;

public class Rubber extends Material {
    public Rubber() {
        System.out.println("🧽 Rubber material is created...");
    }

    @Override
    public void name() {
        System.out.println("Material: Rubber");
    }

    @Override
    public void source() {
        System.out.println("Sourced from rubber trees or made synthetically.");
    }

    @Override
    public void property() {
        System.out.println("Elastic, waterproof, and durable.");
    }

    @Override
    public void use() {
        System.out.println("Used in tires, erasers, shoes, and gloves.");
    }

    @Override
    public void recycle() {
        System.out.println("Recycled into mats, playground surfaces, etc.");
    }
}
