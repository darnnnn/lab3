package nature.swamp;
public class Gallows{
  private final int amount;
  public Gallows(int amount){
      this.amount = amount;
  }
  public void locate(){
      System.out.printf("%s gallows are arranged in a circle.%n", amount);
  }
    public class Bodies{
        public void hangDown(){
            gallows().locate();
            System.out.printf("The strangely twisted bodies of the unfortunate disappeared squatters hung from %s gallows.%n", amount);
        }
        public Gallows gallows(){
            return Gallows.this;
        }
    }
}