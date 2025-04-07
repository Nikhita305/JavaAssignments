package com.inheritance;

public class Diplomat {
    public void visit(Country country) {
        country.name();
        country.population();
        country.language();
        country.capital();
        country.currency();

        if (country instanceof India) {
            India india = (India) country;
            india.festival();
        }
    }
}
