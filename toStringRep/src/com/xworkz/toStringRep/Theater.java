package com.xworkz.toStringRep;

public class Theater {
    private String name;
    private int screens;
    private String location;

    public Theater(String name, int screens, String location) {
        this.name = name;
        this.screens = screens;
        this.location = location;
        System.out.println("Theater Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Screens: " + this.screens + ", Location: " + this.location;
    }

    @Override
    public int hashCode() {
        return 77;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Theater) {
                System.out.println("Ref is Theater, compare");
                Theater theater1 = this;
                Theater theater2 = (Theater) obj;
                if (theater1.name.equals(theater2.name)
                        && theater1.screens == theater2.screens
                        && theater1.location.equals(theater2.location)) {
                    System.out.println("Both Theater objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
