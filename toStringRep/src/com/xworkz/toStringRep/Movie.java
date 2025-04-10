package com.xworkz.toStringRep;

public class Movie {
    private String title;
    private String genre;
    private double rating;

    public Movie(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        System.out.println("Movie Constructor");
    }

    @Override
    public String toString() {
        return "Title: " + this.title + ", Genre: " + this.genre + ", Rating: " + this.rating + "⭐";
    }

    @Override
    public int hashCode() {
        return 50;
    }
}
