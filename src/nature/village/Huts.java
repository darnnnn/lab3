package nature.village;

public class Huts {
    private final int amount;
    public Huts(int amount){
        this.amount = amount;
        System.out.printf("A miserable bunch of %s huts appeared.%n", amount);
    }
    public int getAmount(){
        return amount;
    }
    public class Door{
        private Condition condition;
        { condition = Condition.CLOSE;}

        public void setCondition(Condition condition) {
            this.condition = condition;
        }
        public Huts huts() {
            return Huts.this;
        }
    }
}
