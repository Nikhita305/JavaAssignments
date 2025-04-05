package com.inheritance;

public class Package {
    public Package() {
        System.out.println("Running no-arg constructor of Package");
    }

    public void weight() {
        System.out.println("Package has a specific weight");
    }

    public void size() {
        System.out.println("Package has a defined size");
    }

    public void content() {
        System.out.println("Package contains certain items");
    }

    public void label() {
        System.out.println("Package has a shipping label");
    }

    public void fragile() {
        System.out.println("Package may be marked as fragile");
    }
}
