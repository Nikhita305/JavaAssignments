package classesAndHasARelation;

public class Screw {
    private String material;
    private int length;

    public Screw(String material, int length){
        this.material = material;
        this.length = length;
    }

    public void replace(){
        System.out.println("screw-Replace method"+"\n");
    }
}
