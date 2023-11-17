package nature;
public class Island{
    private String description;
    private int areaSize;
    private int amountOfTrees;
    public Island(String description, int areaSize, int amountOfTrees){
        this.description = description;
        this.areaSize = areaSize;
        this.amountOfTrees = amountOfTrees;
    }
    public String describe(){ 
     return description + " island with an area of about " + areaSize + " acre and with " + amountOfTrees + " trees";
   }
}