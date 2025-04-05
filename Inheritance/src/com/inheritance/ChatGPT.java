package com.inheritance;

public class ChatGPT extends AI {
    public ChatGPT() {
        System.out.println("Running no-arg constructor of ChatGPT");
    }

    @Override
    public void name() {
        System.out.println("AI: ChatGPT 🤖");
    }

    @Override
    public void purpose() {
        System.out.println("ChatGPT is made for conversational understanding and generation");
    }

    @Override
    public void learningType() {
        System.out.println("ChatGPT is built using deep learning transformers");
    }

    @Override
    public void field() {
        System.out.println("Used in customer service, coding help, learning, and content creation");
    }

    @Override
    public void interaction() {
        System.out.println("ChatGPT interacts through natural language conversations");
    }
}
