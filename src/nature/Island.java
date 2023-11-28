package nature;
public class Island{
    private final String description;
    private final int areaSize;
    private final int amountOfTrees;
    public Island(String description, int areaSize, int amountOfTrees){
        this.description = description;
        this.areaSize = areaSize;
        this.amountOfTrees = amountOfTrees;
    }
    @Override
    public String toString(){
     return description + " island with an area of about " + areaSize + " acre and with " + amountOfTrees + " trees";
   }
}