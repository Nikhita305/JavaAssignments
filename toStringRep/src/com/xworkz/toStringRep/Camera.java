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

    @Override
    public int hashCode() {
        return 12;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Camera) {
                System.out.println("Ref,compare");
                Camera camera = this;
                Camera camera1 = (Camera) obj;
                if (camera.brand.equals(camera1.brand)) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
