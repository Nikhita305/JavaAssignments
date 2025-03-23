package com.JavareferenceandVariable;

public class House {
    String address;
    int rooms;
    int squarefeet;
    boolean garage;

    public House(String address, int rooms, int squarefeet, boolean garage) {
        System.out.println("Creating House object");
        this.address = address;
        this.rooms = rooms;
        this.squarefeet = squarefeet;
        this.garage = garage;
    }

    void display() {
        System.out.println("House Details:");
        System.out.println("Address: " + this.address + ", Rooms: " + this.rooms + ", Square Feet: " + this.squarefeet + ", Garage: " + this.garage);
    }
}


