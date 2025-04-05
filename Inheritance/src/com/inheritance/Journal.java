package com.inheritance;

public class Journal extends Notebook {
    public Journal() {
        System.out.println("📔 Journal ready for thoughts and dreams...");
    }

    @Override
    public void purpose() {
        System.out.println("Used for personal reflections, gratitude, and goals.");
    }

    @Override
    public void size() {
        System.out.println("Usually medium-sized for daily writing.");
    }

    @Override
    public void binding() {
        System.out.println("Often has aesthetic stitched or leather binding.");
    }

    @Override
    public void pages() {
        System.out.println("Pages might have date sections, prompts, or just be dotted.");
    }

    @Override
    public void cover() {
        System.out.println("Covered with minimal designs or quotes.");
    }
}
