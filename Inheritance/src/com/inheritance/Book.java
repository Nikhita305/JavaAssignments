package com.inheritance;

public class Book {
    public Book() {
        System.out.println("Running no-arg constructor of Book");
    }

    public void title() {
        System.out.println("This is a book");
    }

    public void author() {
        System.out.println("Books are written by various authors");
    }

    public void genre() {
        System.out.println("Books come in many genres");
    }

    public void pages() {
        System.out.println("Books can have varying number of pages");
    }

    public void language() {
        System.out.println("Books are written in different languages");
    }
}
