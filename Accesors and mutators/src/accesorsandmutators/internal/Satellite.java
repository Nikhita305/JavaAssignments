package accesorsandmutators.internal;

public class Satellite {
    private Type type;
    private String cost;
    private int weight;
    private int loadCapacity;

    public Satellite(Type type, String cost, int weight, int loadCapacity) {
        this.type = type;
        this.cost = cost;
        this.weight = weight;
        this.loadCapacity = loadCapacity;
    }

    public Satellite() {
        System.out.println("No-argument constructor");
    }

    public Type getType() {
        return type;
    }

    public String getCost() {
        return cost;
    }

    public int getWeight() {
        return weight;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
