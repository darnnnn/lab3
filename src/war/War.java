package war;

import java.lang.Thread;
import teams.*;
import weapons.*;
import world.*;
import exception.*;

public class War{
	public void go() throws AmountException, TwinsException{
	Team1 t1 = new Team1();
	Team2 t2 = new Team2();
	CheckTwins check = new CheckTwins();
    if (t1.get().size() != t2.get().size()) throw new AmountException("You have created unequal teams. You can't start a war");
    if (check.checkTwins(t1,t2)) throw new TwinsException("Twins can't fight");
    Stop s = new Stop();
    Choose c = new Choose();
  	for (int i=0; i < t1.get().size(); i++) {
  	  s.stop();
		  (t1.get().get(i)).takeWeapon(c.randomWeapon()); 
		  (t2.get().get(i)).takeWeapon(c.randomWeapon());
		  if (Math.random() <= 0.5) { 
	      (t1.get().get(i)).startFight(t2.get().get(i));
		  } else {
	      (t2.get().get(i)).startFight(t1.get().get(i));
	    }
	  }
		s.stop();
  }
}