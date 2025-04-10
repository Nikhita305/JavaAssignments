package com.xworkz.toStringRep;

public class Bottle {
    private String color;
    private int capacity;
    private String shape;

    public Bottle(String color, int capacity, String shape){
        this.color = color;
        this.capacity = capacity;
        this.shape = shape;
        System.out.println("Bottle Constructor");
    }

    @Override
    public String toString(){
        return "color"+this.color+" "+"capacity"+this.capacity+" "+"shape"+this.shape;
    }

    @Override
    public int hashCode() {
        return 1;
    }
}
