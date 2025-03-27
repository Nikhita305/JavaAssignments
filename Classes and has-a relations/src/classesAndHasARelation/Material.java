package classesAndHasARelation;

public class Material {
    private String type;
    private String texture;

    public Material(String type, String texture){
        this.type = type;
        this.texture = texture;
    }

    public void durability(){
        System.out.println("material Durability Method "+this.type +" "+this.texture+"\n");
    }
}
