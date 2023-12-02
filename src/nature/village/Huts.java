package nature.village;

public class Huts {
    private final int amount;
    public Huts(int amount){
        this.amount = amount;
        System.out.println("A miserable bunch of " + amount + " huts appeared.");
    }
    public int getAmount(){
        return amount;
    }
}
