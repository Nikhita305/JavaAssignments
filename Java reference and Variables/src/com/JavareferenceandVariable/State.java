package com.JavareferenceandVariable;

public class State {
    String name;
    String capital;
    int population;
    double area;

    State(String name, String capital, int population, double area) {
        this.name = name;
        this.capital = capital;
        this.population = population;
        this.area = area;
        System.out.println("The name is: " + this.name + " | The capital is: " + this.capital + " | The population is: " + this.population + " | The area is: " + this.area);
    }

    void display() {
        System.out.println("Running display in State");
    }
}

