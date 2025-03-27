package classesAndHasARelation;

public class Quality {
    private String material;
    private int rating;

    public Quality(String material, int rating){
        this.material = material;
        this.rating = rating;
    }

    public void evaluate(){
        System.out.println("Quality - evaluate Method "+this.material +" "+this.rating+"\n");
    }
}
