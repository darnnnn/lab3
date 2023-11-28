package nature.forest;

public class Stones {
    String description;
    public Stones(String description){
        this.description = description;
    }
    @Override
    public String toString(){
        return "piles of " + description + " stones";
    }
}
