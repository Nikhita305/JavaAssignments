package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.Book;

public class Reader {
    private Book book;

    public Reader(Book book) {
        this.book = book;
        System.out.println("constr in Reader");
    }

    public void startReading() {
        if (this.book != null) {
            System.out.println("not null");
            this.book.read();
        } else {
            System.out.println("null");
        }
    }
}
