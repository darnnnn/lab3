package humans;
import world.Locations;
import java.util.Objects;

public abstract class Human {
  private final String name;
  private double attack;
  private final String country;
  private double health = 100;
  private Status stat = Status.ALIVE;
  private Locations location;

  public Human(String name){
    this(name, 0, "unknown country");
  }

  public Human(String name, double attack){
    this(name, attack, "unknown country");
    }

  public Human(String name, double attack, String country){
    this.name = name;
    this.attack = attack;
    this.country = country;
    System.out.println(this);
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
    if (this.health>100) this.health=100;
  }
  public void setLocation(Locations location) {
    this.location = location;
  }

  public void setStat(Status stat) {
    this.stat = stat;
  }

  @Override
    public String toString() {
    return String.format("%s from %s with attack level %s appeared.", name, country, attack);
   }
   
  @Override
   public int hashCode(){
    return Objects.hash(name, country);
   }
  
  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!=o.getClass()) return false;
        Human that = (Human) o;
        return Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }
}