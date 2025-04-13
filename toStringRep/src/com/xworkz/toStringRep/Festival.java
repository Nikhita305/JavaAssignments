package com.xworkz.toStringRep;

public class Festival {
    private String name;
    private String month;
    private String tradition;

    public Festival(String name, String month, String tradition) {
        this.name = name;
        this.month = month;
        this.tradition = tradition;
        System.out.println("Festival Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Month: " + this.month + ", Tradition: " + this.tradition;
    }

    @Override
    public int hashCode() {
        return 98;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Festival) {
                System.out.println("Ref is Festival, compare");
                Festival Festival = this;
                Festival festival1 = (Festival) obj;
                if (Festival.name.equals(festival1.name)
                        && Festival.month.equals(festival1.month)
                        && Festival.tradition.equals(festival1.tradition)) {
                    System.out.println("Both Festival objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
