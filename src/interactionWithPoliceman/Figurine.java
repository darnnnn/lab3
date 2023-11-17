package interactionWithPoliceman;
public class Figurine{
  private String place;
  public Figurine(String place){
    setPlace(place);
  }
  public void setPlace(String place){
    this.place = place;
    System.out.println("The figurine is " + place);
  }
}