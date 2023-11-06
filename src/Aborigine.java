public class Aborigine extends Human implements StartFightWithPoliceman, TakeWeapon{

  public Aborigine() {
        super();
    }

  public Aborigine(String name, double attack) {
        super(name, attack);
    }

  public Aborigine(String name, double attack, String country) {
        super(name, attack, country);
    }

  private static int amountOfDeadAborigines; // кол-во аборигенов со stat == Status.DEAD

  private static int amountOfCaptiveAborigines; // кол-во аборигенов со stat == Status.IN_CAPTIVITY

  public static int getAmountOfDeadAborigines(){
    return amountOfDeadAborigines;
  }

  public static int getAmountOfCaptiveAborigines(){
    return amountOfCaptiveAborigines;
  }

  public static void newDeadAborigine(){
    amountOfDeadAborigines++;
  }

  public static void newCaptiveAborigine(){
    amountOfCaptiveAborigines++;
  }  

  public void takeWeapon(Weapons weapon){ // абориген берет оружие и в зависимости от этого меняет уровень своей атаки
    switch (weapon) {
    case STICK: 
      setAttack(getAttack() + 30); 
      System.out.println(getName() + " took a stick and flew into a rage");
      break;
    case KNIFE:
      setAttack(getAttack() + 10);  
      System.out.println(getName() + " took a knife!!!");
      break;
    case REVOLVER:
      setAttack(getAttack() - 20);  
      System.out.println(getName() + " stole a revolver but doesn't know how to use it");
      break;
    }
  }

  public void startFight(Policeman p){ // метод для описания борьбы между аборигеном и полицейским
    while ( p.getHealth() > 0 && getHealth() > 0 ){ // драка идет пока оба живы, то есть здоровье больше нуля
      p.setHealth(p.getHealth() - 0.5 * getAttack()); // момент удара, полицейскому снижается здоровье на половину атаки аборигена
      System.out.println(getName() + " hit " + p.getName());
        if (p.getHealth() <= 0 ){ // если после удара здоровье полицейского меньше нуля, он умирает и битва заканчивается
         p.setStat(Status.DEAD);
         break;
        }
      System.out.println(p.getName() + " has " + p.getHealth() + " health"); 
      setHealth(getHealth() - 0.5 * p.getAttack()); // ответный удар от полицейского, здоровье аборигена понижается на половину атаки полицеского
      System.out.println(p.getName() + " hit " + getName());
        if (getHealth() < 20 && getHealth() > 0) { // если здоровье аборигена от 20 до 0, он попадает в плен 
          setStat(Status.IN_CAPTIVITY); // я решила что в плену может быть только абориген
          break;
        }
        if (getHealth() <= 0 ){ // если здоровье аборигена меньше нуля, он умирает и битва заканчивается
         setStat(Status.DEAD);
         break;
        }
      System.out.println(getName() + " has " + getHealth() + " health");
    }
  }

  @Override
  public void setStat(Status stat) {
    super.setStat(stat);
    if (stat == Status.DEAD){
      System.out.println(getName() + " is dead. He deserved it");
      newDeadAborigine();
    }
    if (stat == Status.IN_CAPTIVITY){
      System.out.println(getName() + " in captivity. He will tell us everything");
      newCaptiveAborigine();
    }
  }

}    
       