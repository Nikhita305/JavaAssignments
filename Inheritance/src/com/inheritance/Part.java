package com.inheritance;

public class Part {
    public Part() {
        System.out.println("🛠️ Part constructor called");
    }

    public void manufacture() {
        System.out.println("Part is being manufactured...");
    }

    public void test() {
        System.out.println("Part is undergoing quality testing...");
    }

    public void ship() {
        System.out.println("Part is ready for shipment...");
    }

    public void assemble() {
        System.out.println("Part is being assembled into a product...");
    }

    public void label() {
        System.out.println("Part is being labeled...");
    }
}
