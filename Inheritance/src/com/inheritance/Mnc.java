package com.inheritance;

public class Mnc {
    public void train(Company company){
        company.grow();
        company.hire();
        company.operate();
        company.payTaxes();
        company.register();

        if(company instanceof Startup){
            Startup startup = (Startup) company;
            startup.fire();
        }

    }
}
