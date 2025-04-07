package com.inheritance;

public class Traveler {
    public void visit(City city) {
        city.name();
        city.population();
        city.famousFor();
        city.climate();
        city.transportation();

        if (city instanceof Bengaluru) {
            Bengaluru bengaluru = (Bengaluru) city;
            bengaluru.language();
        }
    }
}
