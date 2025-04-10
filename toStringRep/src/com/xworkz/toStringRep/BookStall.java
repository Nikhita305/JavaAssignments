package com.xworkz.toStringRep;

public class BookStall {
    private String name;
    private String location;
    private int booksAvailable;

    public BookStall(String name, String location, int booksAvailable) {
        this.name = name;
        this.location = location;
        this.booksAvailable = booksAvailable;
        System.out.println("BookStall Constructor");
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Location: " + this.location + ", Books Available: " + this.booksAvailable;
    }

    public int hashCode() {
        return 72;
    }
}
