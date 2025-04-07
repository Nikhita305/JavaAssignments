package com.inheritance;

public class StreetVendor {
    public void display(Snack snack) {
        snack.name();
        snack.type();
        snack.ingredients();
        snack.served();
        snack.popularity();

        if (snack instanceof Samosa) {
            Samosa samosa = (Samosa) snack;
            samosa.crispiness();
        }
    }
}
