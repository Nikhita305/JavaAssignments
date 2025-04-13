package com.xworkz.toStringRep;

public class AngryBird {
    private String name;
    private String color;
    private String power;

    public AngryBird(String name, String color, String power) {
        this.name = name;
        this.color = color;
        this.power = power;
        System.out.println("AngryBird Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Color: " + this.color + ", Power: " + this.power;
    }

    @Override
    public int hashCode() {
        return 92;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof AngryBird) {
                System.out.println("Ref is AngryBird, compare");
                AngryBird AngryBird = this;
                AngryBird angryBird1 = (AngryBird) obj;
                if (AngryBird.name.equals(angryBird1.name)
                        && AngryBird.color.equals(angryBird1.color)
                        && AngryBird.power.equals(angryBird1.power)) {
                    System.out.println("Both AngryBird objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
