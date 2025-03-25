package accesorsandmutators.internal;

public class Jail {
    private String name;
    private String location;
    private String jailerName;
    private int totalCells;

    public Jail(String name, String location, String jailerName, int totalCells) {
        this.name = name;
        this.location = location;
        this.jailerName = jailerName;
        this.totalCells = totalCells;
    }

    public Jail() {
        System.out.println("No-argument constructor running in Jail");
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getJailerName() {
        return jailerName;
    }

    public int getTotalCells() {
        return totalCells;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setJailerName(String jailerName) {
        this.jailerName = jailerName;
    }

    public void setTotalCells(int totalCells) {
        this.totalCells = totalCells;
    }
}
