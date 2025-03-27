package classesAndHasARelation;

public class Button {
    private String label;
    private Material material;

    public Button(String label, Material material){
        this.label = label;
        this.material = material;
    }

    public void press(){
        System.out.println("button-Press Method "+this.label+"\n");
        this.material.durability();
    }
}
