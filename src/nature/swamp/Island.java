package nature.swamp;
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
     return String.format("%s island with an area of about %s acre and with %s trees", description, areaSize, amountOfTrees);
   }
}