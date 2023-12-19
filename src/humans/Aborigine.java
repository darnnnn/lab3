package humans;
import interfaces.for_fight.CanFight;
import war.Weapons;

public class Aborigine extends Human implements CanFight<Policeman>{
    public Aborigine(String name, double attack) {
        super(name, attack);
    }
    public Aborigine(String name, double attack, String country) {
        super(name, attack, country);
    }
  public void setStat(Status stat) {
    super.setStat(stat);
    if (stat == Status.DEAD){
      System.out.printf("%s is dead. He deserved it.%n", getName());
    }
    if (stat == Status.IN_CAPTIVITY){
      System.out.printf("%s in captivity. He will tell us everything.%n", getName());
    }
  }
  public void takeWeapon(Weapons weapon){
      switch (weapon) {
          case STICK -> {
              setAttack(getAttack() + Weapons.STICK.getAttackForAbor());
              System.out.printf("%s took a stick and flew into a rage.%n", getName());
          }
          case KNIFE -> {
              setAttack(getAttack() + Weapons.KNIFE.getAttackForAbor());
              System.out.printf("%s took a knife!!!%n", getName());
          }
          case REVOLVER -> {
              setAttack(getAttack() + Weapons.REVOLVER.getAttackForAbor());
              System.out.printf("%s stole a revolver but doesn't know how to use it.%n", getName());
          }
      }
  }
    public void hit(Policeman h){
        while (getStat() == Status.ALIVE && h.getStat() == Status.ALIVE){
            h.setHealth(h.getHealth() - 0.5 * getAttack());
            System.out.printf("%s hit %s.%n", getName(),  h.getName());
            if (h.getHealth() <= 0 ){
                h.setStat(Status.DEAD);
                break;
            }
            System.out.printf("%s has %s health.%n", h.getName(), h.getHealth());
            h.hit(this);
        }
    }
}    
       