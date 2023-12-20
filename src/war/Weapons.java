package war;

import humans.Aborigine;
import humans.Policeman;

public enum Weapons{
   STICK(30, -10),
   KNIFE(10, 10),
   REVOLVER(-20, 30);
   private final int attackForAbor;
   private final int attackForPol;
   public int getAttackForAbor(){
      return attackForAbor;
   }
   public int getAttackForPol(){
      return attackForPol;
   }
   Weapons(int attackForAbor, int attackForPol){
      this.attackForAbor = attackForAbor;
      this.attackForPol = attackForPol;
   }
}