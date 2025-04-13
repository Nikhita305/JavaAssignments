package com.xworkz.toStringRep;

public class HoneyBee {
    private String species;
    private double wingSpan;
    private String hiveLocation;

    public HoneyBee(String species, double wingSpan, String hiveLocation) {
        this.species = species;
        this.wingSpan = wingSpan;
        this.hiveLocation = hiveLocation;
        System.out.println("HoneyBee Constructor");
    }

    @Override
    public String toString() {
        return "Species: " + this.species + ", Wing Span: " + this.wingSpan + " cm, Hive Location: " + this.hiveLocation;
    }

    @Override
    public int hashCode() {
        return 80;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof HoneyBee) {
                System.out.println("Ref is HoneyBee, compare");
                HoneyBee bee1 = this;
                HoneyBee bee2 = (HoneyBee) obj;
                if (bee1.species.equals(bee2.species)
                        && bee1.wingSpan == bee2.wingSpan
                        && bee1.hiveLocation.equals(bee2.hiveLocation)) {
                    System.out.println("Both HoneyBee objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
