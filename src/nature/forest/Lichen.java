package nature.forest;

public class Lichen {
    String family;
    public Lichen(String family){
        this.family = family;
    }
    @Override
    public String toString() {
        return  "loops of " + family + " lichen";
    }
}
