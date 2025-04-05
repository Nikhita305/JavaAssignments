package com.inheritance;

public class Sunscreen extends Product {
    public Sunscreen() {
        System.out.println("Running no-arg constructor of Sunscreen");
    }

    @Override
    public void name() {
        System.out.println("Sunscreen brand: SunShield SPF 50");
    }

    @Override
    public void price() {
        System.out.println("Sunscreen costs ₹299");
    }

    @Override
    public void manufactureDate() {
        System.out.println("Manufactured in March 2025");
    }

    @Override
    public void expiryDate() {
        System.out.println("Expires in March 2027");
    }

    @Override
    public void use() {
        System.out.println("Used to protect skin from harmful UV rays");
    }
}
