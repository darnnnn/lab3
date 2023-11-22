package humans;

import interfaces.Hit;
import interfaces.TakeWeapon;

import java.util.Objects;

public abstract class Human implements Hit, TakeWeapon {
  private final String name;
  private double attack;
  private final String country;
  private double health = 100;
  private Status stat = Status.ALIVE;

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
  } 

  public void setStat(Status stat) {
    this.stat = stat;
    if (stat == Status.ALIVE){
      System.out.println(name + " is alive"); 
    } 
  }

  public void hit(Human h){
    while ( h.getHealth() > 0 && getHealth() > 0 ){
      h.setHealth(h.getHealth() - 0.5 * getAttack());
      System.out.println(getName() + " hit " + h.getName());
      if (h instanceof Aborigine && h.getHealth() < 20 && h.getHealth() > 0) {
        h.setStat(Status.IN_CAPTIVITY);
        break;
      }
      if (h.getHealth() <= 0 ){
        h.setStat(Status.DEAD);
        break;
      }
      System.out.println(h.getName() + " has " + h.getHealth() + " health");
      h.hit(this);
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
        if (o == null || getClass()!=o.getClass()) return false;
        Human that = (Human) o;
        return attack == that.attack && Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

}