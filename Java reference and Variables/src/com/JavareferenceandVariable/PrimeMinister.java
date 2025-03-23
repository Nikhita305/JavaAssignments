package com.JavareferenceandVariable;

public class PrimeMinister {
    String name;
    String country;
    long startDate;
    long endDate;
    Minister[] ministers = new Minister[]{
            new Minister("Jayashankar", "Foreign Affairs", 50, 10),
            new Minister("Nirmala Sitharaman", "Finance", 40, 10),
            new Minister("Rajnath Singh", "Defence", 73, 20)
    };

    public PrimeMinister(String name, String country, long startDate, long endDate) {
        System.out.println("Creating PrimeMinister object");
        this.name = name;
        this.country = country;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    void display() {
        System.out.println("Prime Minister Details:");
        System.out.println("Name: " + this.name + ", Country: " + this.country + ", Start Date: " + this.startDate + ", End Date: " + this.endDate);

        if (ministers != null) {
            for (Minister minister : ministers) {
                minister.display();
            }
        }
    }
}
