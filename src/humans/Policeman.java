package humans;
import interactionWithHuman.Emotions;
import interactionWithHuman.Figurine;
import interactionWithHuman.Hallucinations;
import interactionWithHuman.Sound;
import interfaces.*;
import interfaces.for_fight.CanFight;
import interfaces.for_policeman.*;
import teams.TeamOfPolicemen;
import war.Weapons;
import exception.DeadException;
import world.Locations;

public class Policeman extends Human implements CanFight<Aborigine>, Hear, See, TakeFigurine, GoWithTeam, Scream, Stagger, Faint, Feel, SplashWater {
  public Policeman(String name, double attack) {
        super(name, attack);
    }
  public Policeman(String name, double attack, String country) { super(name, attack, country); }
  public void setStat(Status stat) {
    super.setStat(stat);
    if (stat == Status.DEAD){
      System.out.printf("%s is dead. Press f to pay respect.%n", getName());
    }
  }
  public void takeWeapon(Weapons weapon){
      setAttack(getAttack() + weapon.getAttackForPol());
      switch (weapon) {
          case STICK -> System.out.printf("%s took a useless weapon.%n", getName());
          case KNIFE -> System.out.printf("%s took a knife!%n", getName());
          case REVOLVER -> System.out.printf("%s took a revolver and started shooting!%n", getName());
      }
  }
  public void hit(Aborigine h){
      while (getStat() == Status.ALIVE && h.getStat() == Status.ALIVE){
          h.setHealth(h.getHealth() - 0.5 * getAttack());
          System.out.printf("%s hit %s.%n", getName(), h.getName());
          if (h.getHealth() < 20 && h.getHealth() > 0) {
              h.setStat(Status.IN_CAPTIVITY);
              break;
          }
          if (h.getHealth() <= 0 ){
              h.setStat(Status.DEAD);
              break;
          }
          System.out.printf("%s has %s health.%n", h.getName(), h.getHealth());
          h.hit(this);
      }
  }
  public void hear(Sound sound){
    System.out.printf("%s heard %s.%n", getName(), sound);
  }
  public void see(Hallucinations hallucinations){
      System.out.printf("%s saw %s.%n", getName(), hallucinations);
  }
  public void takeFigurine(Figurine figurine) throws DeadException{
    if (getStat() == Status.DEAD) throw new DeadException(String.format("%s is dead and can't take the figurine.", getName()));
    figurine.setPlace(String.format("in %s's pocket", getName()));
  }
  public void feel(Emotions e){
      setHealth(getHealth()+e.getEffect());
      System.out.printf("%s feel %s.%n", getName(), e);
  }
  public void goWithTeam(TeamOfPolicemen team, Locations location){
      int amount = team.getTeam().size() - 1;
      System.out.printf("Inspector %s and his %s policemen went on without guides.%n", getName(), amount);
      team.getTeam().forEach(h->h.setLocation(location));
  }
  public Sound scream(){
      feel(Emotions.FEAR);
      return new Sound("of scream");
  }
  public void stagger(){
      System.out.printf("%s staggered.%n", getName());
      setHealth(getHealth()-5);
  }
  public void faint(){
      System.out.printf("%s fainted.%n", getName());
      setHealth(getHealth()-10);
  }
  public void splashWater(Policeman policeman){
      policeman.setHealth(getHealth()+15);
      System.out.printf("%s splashed swamp water in %s's face.%n", getName(), policeman.getName());
  }
}