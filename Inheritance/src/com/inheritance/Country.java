package com.inheritance;

public class Country {
    public Country() {
        System.out.println("Running no-arg constructor of Country");
    }

    public void name() {
        System.out.println("This is a country");
    }

    public void population() {
        System.out.println("Country has a specific population");
    }

    public void language() {
        System.out.println("Country has official languages");
    }

    public void capital() {
        System.out.println("Country has a capital city");
    }

    public void currency() {
        System.out.println("Country has its own currency");
    }
}
