package com.xworkz.toStringRep;

public class Camera {
    private String brand;
    private double resolution;
    private String type;

    public Camera(String brand, double resolution, String type) {
        this.brand = brand;
        this.resolution = resolution;
        this.type = type;
        System.out.println("Camera Constructor");
    }

    @Override
    public String toString() {
        return "Brand: " + this.brand + ", Resolution: " + this.resolution + "MP, Type: " + this.type;
    }
}
