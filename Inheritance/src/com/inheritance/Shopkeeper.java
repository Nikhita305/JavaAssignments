package com.inheritance;

public class Shopkeeper {
    public void display(Mobile mobile) {
        mobile.brand();
        mobile.features();
        mobile.battery();
        mobile.camera();
        mobile.storage();

        if (mobile instanceof Redmi) {
            Redmi redmi = (Redmi) mobile;
            redmi.offer();
        }
    }
}
