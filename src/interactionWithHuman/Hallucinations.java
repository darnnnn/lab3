package interactionWithHuman;
public class Hallucinations{
  private final String description;
  public Hallucinations(String description){
    this.description = description;
  }
  @Override
  public String toString() {
    return description;
  }
}