package com.inheritance;

public class Instagram extends Application {
    public Instagram() {
        System.out.println("Running no-arg constructor of Instagram");
    }

    @Override
    public void name() {
        System.out.println("Instagram - Social Media Application");
    }

    @Override
    public void platform() {
        System.out.println("Instagram is available on Android, iOS, and Web");
    }

    @Override
    public void purpose() {
        System.out.println("Used for sharing photos, reels, stories, and chatting");
    }

    @Override
    public void userCount() {
        System.out.println("Over 2 billion monthly active users");
    }

    @Override
    public void features() {
        System.out.println("Reels, Stories, Filters, Direct Messaging, Shopping");
    }
}
