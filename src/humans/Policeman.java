package humans;

import weapons.*;
import teams.*;
import things.*;

public class Policeman extends Human implements ActionsOfPoliceman, TakeWeapon{

  public Policeman() {
        super();
    }

  public Policeman(String name, double attack) {
        super(name, attack);
    }

  public Policeman(String name, double attack, String country) {
        super(name, attack, country);
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
  
  public void startFight(Aborigine a){ 
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
        if (getHealth() <= 0 ){
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

  @Override 
  public void setStat(Status stat) {
    super.setStat(stat);
    Team2 t2 =new Team2();
    if (stat == Status.DEAD){
      System.out.println(getName() + " is dead. Press f to pay respect");
      t2.newDeadPoliceman();
    }
  }

}