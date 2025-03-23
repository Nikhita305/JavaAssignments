package com.JavareferenceandVariable;

public class PersonalAssistant {
    String name;
    String specialisation;
    int age;
    int experience;

    public PersonalAssistant(String name, String specialisation, int age, int experience) {
        System.out.println("PersonalAssistant");
        this.name = name;
        this.specialisation = specialisation;
        this.age = age;
        this.experience = experience;
    }

    void display() {
        System.out.println("Personal Assistant Details:");
        System.out.println("Name: " + this.name + ", Specialisation: " + this.specialisation + ", Age: " + this.age + ", Experience: " + this.experience);
    }
}
