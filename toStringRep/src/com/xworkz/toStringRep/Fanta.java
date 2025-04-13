package com.xworkz.toStringRep;

public class Fanta {
    private String flavor;
    private int volume;
    private int price;

    public Fanta(String flavor, int volume, int price) {
        this.flavor = flavor;
        this.volume = volume;
        this.price = price;
        System.out.println("Fanta Constructor");
    }

    @Override
    public String toString() {
        return "Flavor: " + this.flavor + ", Volume: " + this.volume + " ml, Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 97;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Fanta) {
                System.out.println("Ref is Fanta, compare");
                Fanta Fanta = this;
                Fanta fanta1 = (Fanta) obj;
                if (Fanta.flavor.equals(fanta1.flavor)
                        && Fanta.volume == fanta1.volume
                        && Fanta.price == fanta1.price) {
                    System.out.println("Both Fanta objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
