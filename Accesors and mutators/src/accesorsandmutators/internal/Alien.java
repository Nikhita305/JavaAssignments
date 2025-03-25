package accesorsandmutators.internal;

public class Alien {
    private String seenBy;
    private String seenDate;
    private String describe;

    public Alien(String seenBy, String seenDate, String describe) {
        this.seenBy = seenBy;
        this.seenDate = seenDate;
        this.describe = describe;
    }

    public Alien() {
        System.out.println("No-argument constructor");
    }

    public String getSeenBy() {
        return seenBy;
    }

    public String getSeenDate() {
        return seenDate;
    }

    public String getDescribe() {
        return describe;
    }

    public void setSeenBy(String seenBy) {
        this.seenBy = seenBy;
    }

    public void setSeenDate(String seenDate) {
        this.seenDate = seenDate;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public void display() {
        System.out.println("Seen By: " + seenBy);
        System.out.println("Seen Date: " + seenDate);
        System.out.println("Description: " + describe);
        System.out.println("---------------------------");
    }
}