package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Country;

public class Administration {
    private Country country;

    public Administration(Country country) {
        this.country = country;
        System.out.println("constr in Administration");
    }

    public void implementLaws() {
        if (this.country != null) {
            System.out.println("not null");
            this.country.govern();
        } else {
            System.out.println("null");
        }
    }
}

