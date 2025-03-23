package com.JavareferenceandVariable;

public class Country {
    String name;
    String language;
    double population;
    int states;
    PrimeMinister primeMinister;

    public Country(String name, String language, double population, int states) {
        System.out.println("Creating Country object");
        this.name = name;
        this.language = language;
        this.population = population;
        this.states = states;
        this.primeMinister = new PrimeMinister("Modi", "India", 2024, 2029);
    }

    void display() {
        System.out.println("Country Details:");
        System.out.println("Name: " + this.name + ", Language: " + this.language + ", Population: " + this.population + ", States: " + this.states);

        if (primeMinister != null) {
            primeMinister.display();
        } else {
            System.out.println("No Prime Minister assigned");
        }
    }
}
