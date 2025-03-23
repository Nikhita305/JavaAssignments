package com.JavareferenceandVariable;

public class Personnel {
    String personnelType;
    int personnelID;
    String shiftTiming;
    boolean isTrained;
    Skill skill = new Skill("unknown", 8, "fighting", 5);

    public Personnel(String personnelType, int personnelID, String shiftTiming, boolean isTrained) {
        System.out.println("Creating Personnel object");
        this.personnelType = personnelType;
        this.personnelID = personnelID;
        this.shiftTiming = shiftTiming;
        this.isTrained = isTrained;
    }

    void display() {
        System.out.println("Personnel Details:");
        System.out.println("Type: " + this.personnelType + ", ID: " + this.personnelID + ", Shift: " + this.shiftTiming + ", Trained: " + this.isTrained);

        if (skill != null) {
            skill.display();
        }
    }
}
