package com.xworkz.inheritanceTypes.multiLevel;

public class EBook extends Book {
    private double fileSize;

    public EBook(String title, double fileSize) {
        super(title);
        this.fileSize = fileSize;
    }

    public double getFileSize() {
        return fileSize;
    }
}

