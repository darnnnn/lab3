package war;
import exception.AmountException;
import exception.TwinsException;
import teams.TeamOfAborigines;
import teams.TeamOfPolicemans;
import weapons.Choose;
public class War{
	public void go() throws AmountException, TwinsException{
	TeamOfAborigines t1 = new TeamOfAborigines();
	TeamOfPolicemans t2 = new TeamOfPolicemans();
    if (t1.get().size() != t2.get().size()) throw new AmountException("You have created unequal teams. You can't start a war");
    if (Twins.check(t1,t2)) throw new TwinsException("Twins can't fight");
  	for (int i=0; i < t1.get().size(); i++) {
  	    MyThread.stop();
		(t1.get().get(i)).takeWeapon(Choose.randomWeapon());
		(t2.get().get(i)).takeWeapon(Choose.randomWeapon());
		if (Math.random() <= 0.5) t1.get().get(i).hitPoliceman(t2.get().get(i));
		else t2.get().get(i).hitAborigine(t1.get().get(i));
	}
    MyThread.stop();
  }
}