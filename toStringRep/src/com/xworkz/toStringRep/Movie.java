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

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Movie) {
                System.out.println("Ref,compare");
                Movie movie = this;
                Movie movie1 = (Movie) obj;
                if (movie.title.equals(movie1.title) && movie.genre.equals(movie1.genre)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
