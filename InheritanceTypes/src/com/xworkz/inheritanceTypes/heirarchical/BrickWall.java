package com.xworkz.inheritanceTypes.heirarchical;

public class BrickWall extends Wall {
    private String brickType;

    public BrickWall(String material, double height, String brickType) {
        super(material, height);
        this.brickType = brickType;
    }

    public String getBrickType() {
        return brickType;
    }
}
