package interactionWithHuman;
public class Figurine{
  private String place;
  public void setPlace(String place){
    this.place = place;
    System.out.printf("The figurine is %s.%n", place);
  }
}