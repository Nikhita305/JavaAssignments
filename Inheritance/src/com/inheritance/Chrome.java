package com.inheritance;

public class Chrome extends Browser {
    public Chrome() {
        System.out.println("Running no-arg constructor of Chrome");
    }

    @Override
    public void name() {
        System.out.println("This browser is Google Chrome");
    }

    @Override
    public void speed() {
        System.out.println("Chrome is known for fast browsing speed");
    }

    @Override
    public void security() {
        System.out.println("Chrome offers advanced security and sandboxing");
    }

    @Override
    public void extensions() {
        System.out.println("Chrome Web Store offers thousands of extensions");
    }

    @Override
    public void platform() {
        System.out.println("Chrome is available on Windows, macOS, Android, iOS");
    }

    public void devTools() {
        System.out.println("Chrome has built-in developer tools for debugging");
    }

}
