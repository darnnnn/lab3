package nature;

import java.util.Objects;

public class Island{
    private String description = "grassy, dry";
    private int areaSize = 1;
    private static int amountOfTrees = 0;

    public String describe(){ 
     return description + " island with an area of about " + areaSize + " acre and with " + amountOfTrees + " trees";
   }
}