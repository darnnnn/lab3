package humans;
import interfaces.Hit;
import interfaces.TakeWeapon;
import weapons.Weapons;

public class Aborigine extends Human implements TakeWeapon, Hit<Policeman>{
    public Aborigine(String name, double attack) {
        super(name, attack);
    }
    public Aborigine(String name, double attack, String country) {
        super(name, attack, country);
    }
  public void setStat(Status stat) {
    super.setStat(stat);
    if (stat == Status.DEAD){
      System.out.println(getName() + " is dead. He deserved it.");
    }
    if (stat == Status.IN_CAPTIVITY){
      System.out.println(getName() + " in captivity. He will tell us everything.");
    }
  }
  public void takeWeapon(Weapons weapon){
      switch (weapon) {
          case STICK -> {
              setAttack(getAttack() + 30);
              System.out.println(getName() + " took a stick and flew into a rage.");
          }
          case KNIFE -> {
              setAttack(getAttack() + 10);
              System.out.println(getName() + " took a knife!!!");
          }
          case REVOLVER -> {
              setAttack(getAttack() - 20);
              System.out.println(getName() + " stole a revolver but doesn't know how to use it.");
          }
      }
  }
    public void hit(Policeman h){
        while (getStat() == Status.ALIVE && h.getStat() == Status.ALIVE){
            h.setHealth(h.getHealth() - 0.5 * getAttack());
            System.out.println(getName() + " hit " + h.getName() + ".");
            if (h.getHealth() <= 0 ){
                h.setStat(Status.DEAD);
                break;
            }
            System.out.println(h.getName() + " has " + h.getHealth() + " health.");
            h.hit(this);
        }
    }
}    
       