package com.xworkz.toStringRep;

public class Zombie {
    private String name;
    private int speed;
    private String origin;

    public Zombie(String name, int speed, String origin) {
        this.name = name;
        this.speed = speed;
        this.origin = origin;
        System.out.println("Zombie Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Speed: " + this.speed + " km/h, Origin: " + this.origin;
    }

    @Override
    public int hashCode() {
        return 82;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Zombie) {
                System.out.println("Ref is Zombie, compare");
                Zombie zombie1 = this;
                Zombie zombie2 = (Zombie) obj;
                if (zombie1.name.equals(zombie2.name)
                        && zombie1.speed == zombie2.speed
                        && zombie1.origin.equals(zombie2.origin)) {
                    System.out.println("Both Zombie objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
