package classesAndHasARelation;

public class Waranty {
    private int startDate;
    private int endDate;

    public Waranty(int startDate, int endDate){
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public void expiry(){
        System.out.println("warranty-Expiry method "+this.startDate +" "+this.endDate+"\n");
    }
}
