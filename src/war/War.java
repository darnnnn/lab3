package war;

import java.lang.Thread;
import teams.*;
import weapons.*;
import world.*;

public class War{
	public void go() { 
	  Stop s = new Stop();
	  Team1 t1 = new Team1();
	  Team2 t2 = new Team2();
    if ( t1.get().size() != t2.get().size() ) { 
      s.stop();
  	  System.out.println("You have created unequal teams. You can't start a war");
    } else {
      Choose c = new Choose();
      ResultOfWar r = new ResultOfWar();
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
        World.setLocation(Locations.POLICE_STATION);
        r.result();
	  }
	}
}