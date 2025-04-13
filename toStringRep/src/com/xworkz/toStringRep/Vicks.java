package com.xworkz.toStringRep;

public class Vicks {
    private String type;
    private String scent;
    private double price;

    public Vicks(String type, String scent, double price) {
        this.type = type;
        this.scent = scent;
        this.price = price;
        System.out.println("Vicks Constructor");
    }

    @Override
    public String toString() {
        return "Type: " + this.type + ", Scent: " + this.scent + ", Price: ₹" + this.price;
    }

    @Override
    public int hashCode() {
        return 65;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Vicks) {
                System.out.println("Ref is Vicks, compare");
                Vicks vicks1 = this;
                Vicks vicks2 = (Vicks) obj;
                if (vicks1.type.equals(vicks2.type)
                        && vicks1.scent.equals(vicks2.scent)
                        && vicks1.price == vicks2.price) {
                    System.out.println("Both Vicks objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
