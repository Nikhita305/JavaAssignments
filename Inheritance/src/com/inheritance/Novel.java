package com.inheritance;

public class Novel extends Book {
    public Novel() {
        System.out.println("Running no-arg constructor of Novel");
    }

    @Override
    public void title() {
        System.out.println("This is a fictional novel");
    }

    @Override
    public void author() {
        System.out.println("Novels are written by novelists");
    }

    @Override
    public void genre() {
        System.out.println("Novels often belong to romance, thriller, or fantasy genres");
    }

    @Override
    public void pages() {
        System.out.println("Novels usually have 200 to 600 pages");
    }

    @Override
    public void language() {
        System.out.println("Novels are written in popular languages like English or Hindi");
    }
}
