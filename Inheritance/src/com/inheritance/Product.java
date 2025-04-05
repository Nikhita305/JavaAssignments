package com.inheritance;

public class Product {
    public Product() {
        System.out.println("Running no-arg constructor of Product");
    }

    public void name() {
        System.out.println("Product has a brand name");
    }

    public void price() {
        System.out.println("Product has a price");
    }

    public void manufactureDate() {
        System.out.println("Product has a manufacture date");
    }

    public void expiryDate() {
        System.out.println("Product has an expiry date");
    }

    public void use() {
        System.out.println("Product is used by customers");
    }
}
