package accesorsandmutators.internal;
import java.util.Arrays;

public class IdCard {
    private String material;
    private String[] colors;
    private int weight;
    private String designedBy;

    public IdCard(String material, String[] colors, int weight, String designedBy) {
        this.material = material;
        this.colors = colors;
        this.weight = weight;
        this.designedBy = designedBy;
    }

    public IdCard() {
        System.out.println("No-argument constructor");
    }

    public String getMaterial() {
        return material;
    }

    public String[] getColors() {
        return colors;
    }

    public int getWeight() {
        return weight;
    }

    public String getDesignedBy() {
        return designedBy;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColors(String[] colors) {
        this.colors = colors;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setDesignedBy(String designedBy) {
        this.designedBy = designedBy;
    }

    public void display() {
        System.out.println("Material: " + material);
        System.out.println("Colors: " + Arrays.toString(colors));
        System.out.println("Weight: " + weight + "g");
        System.out.println("Designed By: " + designedBy);
        System.out.println("---------------------------");
    }
}
