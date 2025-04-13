package com.xworkz.toStringRep;

public class Gym {
    private String name;
    private String location;
    private int members;

    public Gym(String name, String location, int members) {
        this.name = name;
        this.location = location;
        this.members = members;
        System.out.println("Gym Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Location: " + this.location + ", Members: " + this.members;
    }

    @Override
    public int hashCode() {
        return 71;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Gym) {
                System.out.println("Ref is Gym, compare");
                Gym gym1 = this;
                Gym gym2 = (Gym) obj;
                if (gym1.name.equals(gym2.name)
                        && gym1.location.equals(gym2.location)
                        && gym1.members == gym2.members) {
                    System.out.println("Both Gyms are same");
                    return true;
                }
            }
        }
        return false;
    }
}
