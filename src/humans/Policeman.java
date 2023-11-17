package humans;

import interactionWithPoliceman.Emotions;
import interactionWithPoliceman.Figurine;
import interactionWithPoliceman.Hallucinations;
import interactionWithPoliceman.Sound;
import interfaces.Feel;
import interfaces.Hear;
import interfaces.HitAborigine;
import interfaces.See;
import interfaces.Take;
import interfaces.TakeWeapon;
import weapons.Weapons;
import exception.DeadException;
public class Policeman extends Human implements TakeWeapon, HitAborigine, Hear, See, Feel, Take{
  public Policeman() {
        super();
    }
  public Policeman(String name, double attack) {
        super(name, attack);
    }
  public Policeman(String name, double attack, String country) {
        super(name, attack, country);
    }
  public void setStat(Status stat) {
    super.setStat(stat);
    if (stat == Status.DEAD){
      System.out.println(getName() + " is dead. Press f to pay respect");
    }
  }
  public void takeWeapon(Weapons weapon){ 
    switch (weapon) {
    case STICK: 
      setAttack(getAttack() - 10); 
      System.out.println(getName() + " took a useless weapon");
      break;
    case KNIFE:
      setAttack(getAttack() + 10); 
      System.out.println(getName() + " took a knife!");
      break;
    case REVOLVER:
      setAttack(getAttack() + 30); 
      System.out.println(getName() + " took a revolver and started shooting!");
      break;
    }
  }
  public void hitAborigine(Aborigine a){
    while ( a.getHealth() > 0 && getHealth() > 0 ){
      a.setHealth(a.getHealth() - 0.5 * getAttack());
      System.out.println(getName() + " hit " + a.getName());
        if (a.getHealth() < 20 && a.getHealth() > 0) { 
          a.setStat(Status.IN_CAPTIVITY); 
          break;
        }
        if (a.getHealth() <= 0 ){
         a.setStat(Status.DEAD);
         break;
        }
      System.out.println(a.getName() + " has " + a.getHealth() + " health");
      setHealth(getHealth() - 0.5 * a.getAttack());
      System.out.println(a.getName() + " hit " + getName());
      if (getHealth() <= 0 ) {
        setStat(Status.DEAD);
        break;
      }
      System.out.println(getName() + " has " + getHealth() + " health");
    }
  }
  public void hear(Sound s){
    System.out.println(getName() + " heard sound from " + s.getSource());
  }
  public void see(Hallucinations h){
    System.out.println(getName() + " saw " + h.getDescription());
  }
  public void feel(Emotions e){
    switch (e) {
    case STUPOR:
      System.out.println(getName() + " fell into a stupor");
      break;
    case COURAGE:
      System.out.println("A sense of duty prevailed and the " + getName() + " moved forward decisively");
      break;  
    }
  }
  public void take(Figurine f)throws DeadException{
    if (getStat() == Status.DEAD) throw new DeadException(getName() + " is dead and can't take the figurine");
    f.setPlace("in " + getName() + "'s pocket");
  }
}