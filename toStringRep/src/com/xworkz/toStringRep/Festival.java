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

    public int hashCode() {
        return 98;
    }
}
