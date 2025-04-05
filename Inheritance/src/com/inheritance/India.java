package com.inheritance;

public class India extends Country {
    public India() {
        System.out.println("Running no-arg constructor of India");
    }

    @Override
    public void name() {
        System.out.println("Country Name: India");
    }

    @Override
    public void population() {
        System.out.println("India's population exceeds 1.4 billion");
    }

    @Override
    public void language() {
        System.out.println("India has 22 official languages and many regional ones");
    }

    @Override
    public void capital() {
        System.out.println("Capital of India is New Delhi");
    }

    @Override
    public void currency() {
        System.out.println("India's currency is the Indian Rupee (INR)");
    }
}
