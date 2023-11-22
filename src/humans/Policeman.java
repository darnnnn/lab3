package humans;

import interactionWithPoliceman.Emotions;
import interactionWithPoliceman.Figurine;
import interactionWithPoliceman.Hallucinations;
import interactionWithPoliceman.Sound;
import interfaces.Feel;
import interfaces.Hear;
import interfaces.See;
import interfaces.Take;
import interfaces.TakeWeapon;
import weapons.Weapons;
import exception.DeadException;
public class Policeman extends Human implements Hear, See, Feel, Take{
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
          case STICK -> {
              setAttack(getAttack() - 10);
              System.out.println(getName() + " took a useless weapon");
          }
          case KNIFE -> {
              setAttack(getAttack() + 10);
              System.out.println(getName() + " took a knife!");
          }
          case REVOLVER -> {
              setAttack(getAttack() + 30);
              System.out.println(getName() + " took a revolver and started shooting!");
          }
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
          case STUPOR -> System.out.println(getName() + " fell into a stupor");
          case COURAGE -> System.out.println("A sense of duty prevailed and the " + getName() + " moved forward decisively");
      }
  }
  public void take(Figurine f) throws DeadException{
    if (getStat() == Status.DEAD) throw new DeadException(getName() + " is dead and can't take the figurine");
    f.setPlace("in " + getName() + "'s pocket");
  }
}