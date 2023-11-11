package nature;

import java.util.ArrayList;
import humans.*;
import teams.*;

public class Bonfire{
  public Bonfire(){
    Team1 t1 = new Team1();
    t1.get().forEach(a -> a.haveFun());
  }
}
