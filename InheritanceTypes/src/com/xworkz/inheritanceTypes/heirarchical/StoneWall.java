package com.xworkz.inheritanceTypes.heirarchical;

public class StoneWall extends Wall {
    private String stoneType;

    public StoneWall(String material, double height, String stoneType) {
        super(material, height);
        this.stoneType = stoneType;
    }

    public String getStoneType() {
        return stoneType;
    }
}
