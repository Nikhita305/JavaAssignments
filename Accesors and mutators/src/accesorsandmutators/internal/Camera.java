package accesorsandmutators.internal;

public class Camera {
    private String brand;
    private double price;
    private CameraType type;
    private String connectivity;

    public Camera(String brand, double price, CameraType type, String connectivity) {
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.connectivity = connectivity;
    }

    public Camera() {
        System.out.println("No-argument constructor running in Camera");
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public CameraType getType() {
        return type;
    }

    public String getConnectivity() {
        return connectivity;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setType(CameraType type) {
        this.type = type;
    }

    public void setConnectivity(String connectivity) {
        this.connectivity = connectivity;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
        System.out.println("Type: " + type);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("---------------------------");
    }
}