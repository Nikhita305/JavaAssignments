package com.xworkz.toStringRep;

public class Fan {
    private String brand;
    private int speed;
    private String type;

    public Fan(String brand, int speed, String type) {
        this.brand = brand;
        this.speed = speed;
        this.type = type;
        System.out.println("Fan Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Speed: " + this.speed + " RPM, Type: " + this.type;
    }

    @Override
    public int hashCode() {
        return 8;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Fan) {
                System.out.println("Ref,compare");
                Fan fan = this;
                Fan fan1 = (Fan) obj;
                if (fan.brand.equals(fan1.brand)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
