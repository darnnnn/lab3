package nature;
public class Gallows{
  private int amount;
  public Gallows(int amount){
      this.amount = amount;
      System.out.println(amount + " gallows are arranged in a circle");
  }
  public int getAmount(){
  	return amount;
  }
}