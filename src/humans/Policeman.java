package humans;
import interactionWithHuman.Figurine;
import interactionWithHuman.Hallucinations;
import interactionWithHuman.Sound;
import interfaces.*;
import teams.TeamOfPolicemen;
import weapons.Weapons;
import exception.DeadException;

public class Policeman extends Human implements TakeWeapon, Hit<Aborigine>, Hear, See, Take, GoInUnknownArea{
  public Policeman(String name, double attack) {
        super(name, attack);
    }
  public Policeman(String name, double attack, String country) { super(name, attack, country); }
  public void setStat(Status stat) {
    super.setStat(stat);
    if (stat == Status.DEAD){
      System.out.println(getName() + " is dead. Press f to pay respect.");
    }
  }
  public void takeWeapon(Weapons weapon){
      switch (weapon) {
          case STICK -> {
              setAttack(getAttack() - 10);
              System.out.println(getName() + " took a useless weapon.");
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
    public void hit(Aborigine h){
        while (getStat() == Status.ALIVE && h.getStat() == Status.ALIVE){
            h.setHealth(h.getHealth() - 0.5 * getAttack());
            System.out.println(getName() + " hit " + h.getName() + ".");
            if (h.getHealth() < 20 && h.getHealth() > 0) {
                h.setStat(Status.IN_CAPTIVITY);
                break;
            }
            if (h.getHealth() <= 0 ){
                h.setStat(Status.DEAD);
                break;
            }
            System.out.println(h.getName() + " has " + h.getHealth() + " health.");
            h.hit(this);
        }
    }
  public void hear(Sound s){
    System.out.println(getName() + " heard " + s + ".");
  }
  public void see(Hallucinations h){
    System.out.println(getName() + " saw " + h + ".");
  }
  public void take(Figurine f) throws DeadException{
    if (getStat() == Status.DEAD) throw new DeadException(getName() + " is dead and can't take the figurine.");
    f.setPlace("in " + getName() + "'s pocket");
  }
  public void goInUnknownArea(TeamOfPolicemen t){
      int amount = t.getTeam().size() - 1;
      System.out.println("Inspector " + getName() +  " and his " + amount + " policemen went on without guides.");
  }
}