package nature;

import java.util.ArrayList;
import humans.*;
import teams.*;

public class Bonfire{
  public void burn(){
    System.out.println("The fire is burning");
    Team1 t1 = new Team1();
    t1.get().forEach(a -> a.haveFun());
  }
}
