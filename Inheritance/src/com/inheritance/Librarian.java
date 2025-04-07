package com.inheritance;

public class Librarian {
    public void read(Book book) {
        book.title();
        book.author();
        book.genre();
        book.pages();
        book.language();

        if (book instanceof Novel) {
            Novel novel = (Novel) book;
            novel.storyline();
        }
    }
}
