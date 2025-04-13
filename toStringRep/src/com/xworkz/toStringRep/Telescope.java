package com.xworkz.toStringRep;

public class Telescope {
    private String brand;
    private String type;
    private double zoom;

    public Telescope(String brand, String type, double zoom) {
        this.brand = brand;
        this.type = type;
        this.zoom = zoom;
        System.out.println("Telescope Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Type: " + this.type + ", Zoom: " + this.zoom + "x";
    }

    public int hashCode() {
        return 63;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Telescope) {
                System.out.println("Ref is Telescope, compare");
                Telescope telescope1 = this;
                Telescope telescope2 = (Telescope) obj;
                if (telescope1.brand.equals(telescope2.brand)
                        && telescope1.type.equals(telescope2.type)
                        && telescope1.zoom == telescope2.zoom) {
                    System.out.println("Both Telescope objects are same");
                    return true;
                }
            }
        }
        return false;
    }

}
