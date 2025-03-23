package com.JavareferenceandVariable;

public class Minister {
    String name;
    String department;
    int age;
    int experience;
    PersonalAssistant personalAssistant = new PersonalAssistant("Tina", "schedule", 30, 5);
    Security security = new Security("national", 30, "high", true);
    Portfolio[] portfolio = new Portfolio[]{
            new Portfolio("foreign", 101, "country affairs", 30),
            new Portfolio("finance", 103, "finance of country", 100)
    };
    House house = new House("Mangalore", 4, 7, false);
    State[] state = new State[]{
            new State("Karnataka", "Bengaluru", 9, 14),
            new State("Maharashtra", "Mumbai", 14, 33)
    };

    public Minister(String name, String department, int age, int experience) {
        System.out.println("Creating Minister object");
        this.name = name;
        this.department = department;
        this.age = age;
        this.experience = experience;
    }

    void display() {
        System.out.println("Minister Details:");
        System.out.println("Name: " + this.name + ", Department: " + this.department + ", Age: " + this.age + ", Experience: " + this.experience);

        if (personalAssistant != null) {
            personalAssistant.display();
        }
        if (security != null) {
            security.display();
        }
        if (portfolio != null) {
            for (Portfolio ref : portfolio) {
                ref.display();
            }
        }
        if (house != null) {
            house.display();
        }
        if (state != null) {
            for (State ref2 : state) {
                ref2.display();
            }
        }
    }
}
