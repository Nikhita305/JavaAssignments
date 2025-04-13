package com.xworkz.toStringRep;

public class Currency {
    private String country;
    private String name;
    private double value;

    public Currency(String country, String name, double value) {
        this.country = country;
        this.name = name;
        this.value = value;
        System.out.println("Currency Constructor");
    }

    @Override
    public String toString() {
        return "Country: " + this.country + ", Name: " + this.name + ", Value: ₹" + this.value;
    }

    @Override
    public int hashCode() {
        return 99;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Currency) {
                System.out.println("Ref is Currency, compare");
                Currency currency = this;
                Currency currency1 = (Currency) obj;
                if (currency.country.equals(currency1.country)
                        && currency.name.equals(currency1.name)
                        && currency.value == currency1.value) {
                    System.out.println("Both Currency objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
