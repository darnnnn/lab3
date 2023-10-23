import java.util.Objects;

public abstract class Human{ //класс-родитель для Policeman и Aborigine
  private String name;
  private double attack;
  private String country;
  private double health = 100;
  protected Status stat = Status.ALIVE; //модификатор доступа protected, тк в классах наследниках надо будет переопределить сеттер

  public Human(){
    this("Unknown", 0, "unknown");
   }
  
  public Human(String name, double attack){
    this(name, attack, "unknown country");
    }

  public Human(String name, double attack, String country){
    this.name = name;
    this.attack = attack;
    this.country = country;
    System.out.println(this.toString());
   }

  public String getName() {
    return name;
  } 

  public double getAttack() {
    return attack;
  }

  public double getHealth() {
    return health;
  } 

  public Status getStat() {
    return stat;
  }

  public void setAttack(double attack) {
    this.attack = attack;
  }

  public void setHealth(double health) {
    this.health = health;
  } 

  public void setStat(Status stat) {
    this.stat = stat;
    if (stat == Status.ALIVE){
      System.out.println(name + " is alive"); // остальные статусы буду расписывать при переопределении
    } 
  }

  @Override
    public String toString() { 
     return name + " from " + country + " with attack level " + attack + " appeared";
   }
   
  @Override
   public int hashCode(){
    return Objects.hash(name, attack, country);
   }
  
  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human that = (Human) o;
        return attack == that.attack && Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

}