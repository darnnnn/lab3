package war;

import teams.*;
import weapons.*;
import world.*;

public class War{

	public void go() { 
    if ( Team1.get().size() != Team2.get().size() ) { 
  	  System.out.println("You have created unequal teams. You can't start a war"); 
    } else {
  	  for (int i=0; i < Team1.get().size(); i++) {
  	  	s.stop();
		(Team1.get().get(i)).takeWeapon(c.randomWeapon()); 
		(Team2.get().get(i)).takeWeapon(c.randomWeapon());
		  if (Math.random() <= 0.5) { 
	      (Team1.get().get(i)).startFight(Team2.get().get(i));
		  } else {
	      (Team2.get().get(i)).startFight(Team1.get().get(i));
	      }
	    }
		s.stop();
		w.setLocation(Locations.POLICE_STATION);
		r.result();
	  }
	}
	private Choose c = new Choose();
	private Stop s = new Stop();
	private World w = new World();
	private ResultOfWar r = new ResultOfWar();
}