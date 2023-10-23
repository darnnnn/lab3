public class Policeman extends Human implements ActionsOfPoliceman{

  public Policeman() {
        super();
    }

  public Policeman(String name, double attack) {
        super(name, attack);
    }

  public Policeman(String name, double attack, String country) {
        super(name, attack, country);
    } 

  private static int amountOfDeadPolicemans;

  public static int getAmountOfDeadPolicemans(){ // кол-во полицеских со статусом  Status.DEAD
    return amountOfDeadPolicemans; 
  }
  
  public static void newDeadPoliceman(){
    amountOfDeadPolicemans++;
  }

  public void takeWeapon(Weapons weapon){ // полицеский берет оружие и в зависимости от этого меняет атаку
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

  // подробнее принцип борьбы расписан в классе Aborigine 
  
  public void startFight(Aborigine a){ // метод для борьбы полицейского и аборигена
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

  @Override 
  public void setStat(Status stat) {
    this.stat = stat;
    if (stat == Status.DEAD){
      System.out.println(getName() + " is dead. Press f to pay respect");
      newDeadPoliceman();
    }
  }

}