package com.xworkz.inheritanceTypes.multiLevel;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int employeeId, int teamSize) {
        super(name, employeeId);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }
}
