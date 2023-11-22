package nature;
public class Gallows{
  private final int amount;
  public Gallows(int amount){
      this.amount = amount;
  }
  public int getAmount(){
        return amount;
    }
  public void locate(){
      System.out.println(amount + " gallows are arranged in a circle");
  }
}