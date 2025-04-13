package com.xworkz.toStringRep;

public class Astronut {
    private String name;
    private String mission;
    private int age;

    public Astronut(String name, String mission, int age) {
        this.name = name;
        this.mission = mission;
        this.age = age;
        System.out.println("Astronut Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Mission: " + this.mission + ", Age: " + this.age;
    }

    @Override
    public int hashCode() {
        return 62;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Astronut) {
                System.out.println("Ref is Astronut, compare");
                Astronut astronut1 = this;
                Astronut astronut2 = (Astronut) obj;
                if (astronut1.name.equals(astronut2.name) &&
                        astronut1.mission.equals(astronut2.mission) &&
                        astronut1.age == astronut2.age) {
                    System.out.println("Both Astronuts are same");
                    return true;
                }
            }
        }
        return false;
    }
}
