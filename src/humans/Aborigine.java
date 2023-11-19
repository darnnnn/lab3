package humans;
import interfaces.HaveFun;
import interfaces.HitPoliceman;
import interfaces.TakeWeapon;
import weapons.Weapons;
public class Aborigine extends Human implements TakeWeapon, HitPoliceman, HaveFun{
  public Aborigine() {
        super();
    }
  public Aborigine(String name, double attack) {
        super(name, attack);
    }
  public Aborigine(String name, double attack, String country) {
        super(name, attack, country);
    }
  public void setStat(Status stat) {
    super.setStat(stat);
    if (stat == Status.DEAD){
      System.out.println(getName() + " is dead. He deserved it");
    }
    if (stat == Status.IN_CAPTIVITY){
      System.out.println(getName() + " in captivity. He will tell us everything");
    }
  }
  public void takeWeapon(Weapons weapon){
      switch (weapon) {
          case STICK -> {
              setAttack(getAttack() + 30);
              System.out.println(getName() + " took a stick and flew into a rage");
          }
          case KNIFE -> {
              setAttack(getAttack() + 10);
              System.out.println(getName() + " took a knife!!!");
          }
          case REVOLVER -> {
              setAttack(getAttack() - 20);
              System.out.println(getName() + " stole a revolver but doesn't know how to use it");
          }
      }
  }
  public void hitPoliceman(Policeman p){
    while ( p.getHealth() > 0 && getHealth() > 0 ){ 
      p.setHealth(p.getHealth() - 0.5 * getAttack()); 
      System.out.println(getName() + " hit " + p.getName());
        if (p.getHealth() <= 0 ){ 
         p.setStat(Status.DEAD);
         break;
        }
      System.out.println(p.getName() + " has " + p.getHealth() + " health"); 
      setHealth(getHealth() - 0.5 * p.getAttack()); 
      System.out.println(p.getName() + " hit " + getName());
        if (getHealth() < 20 && getHealth() > 0) { 
          setStat(Status.IN_CAPTIVITY); 
          break;
        }
        if (getHealth() <= 0 ){ 
         setStat(Status.DEAD);
         break;
        }
      System.out.println(getName() + " has " + getHealth() + " health");
    }
  }
  public void haveFun(){
    System.out.println(getName() + " howled and writhed");
  }
}    
       