package com.xworkz.interfaceC.external;

import com.xworkz.interfaceC.internal.VirtualAssistant;

public class User {
    private VirtualAssistant assistant;

    public User(VirtualAssistant assistant) {
        this.assistant = assistant;
        System.out.println("constr in User");
    }

    public void askQuestion() {
        if (this.assistant != null) {
            System.out.println("not null");
            this.assistant.respondToCommand();
        } else {
            System.out.println("null");
        }
    }
}
