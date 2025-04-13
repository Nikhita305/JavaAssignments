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

    @Override
    public int hashCode() {
        return 72;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof BookStall) {
                System.out.println("Ref is BookStall, compare");
                BookStall bookStall1 = this;
                BookStall bookStall2 = (BookStall) obj;
                if (bookStall1.name.equals(bookStall2.name)
                        && bookStall1.location.equals(bookStall2.location)
                        && bookStall1.booksAvailable == bookStall2.booksAvailable) {
                    System.out.println("Both BookStall objects are same");
                    return true;
                }
            }
        }
        return false;
    }
}
