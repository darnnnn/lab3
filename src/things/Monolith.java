package things;

public class Monolith{
	private String material = "granite";
	private int height = 8;
	private String place = "top";

	public String getPlace(){
	  return place;
	}
	
    public void riseUp(){
      System.out.println(height + "-foot tall " + material + " monolith towered above them");
    }

}