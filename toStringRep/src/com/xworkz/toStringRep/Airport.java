package com.xworkz.toStringRep;

public class Airport {
    private String name;
    private String location;
    private int terminals;

    public Airport(String name, String location, int terminals) {
        this.name = name;
        this.location = location;
        this.terminals = terminals;
        System.out.println("Airport Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Location: " + this.location + ", Terminals: " + this.terminals;
    }

    @Override
    public int hashCode() {
        return 73;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Airport) {
                System.out.println("Ref is Airport, compare");
                Airport airport1 = this;
                Airport airport2 = (Airport) obj;
                if (airport1.name.equals(airport2.name)
                        && airport1.location.equals(airport2.location)
                        && airport1.terminals == airport2.terminals) {
                    System.out.println("Both Airport objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
