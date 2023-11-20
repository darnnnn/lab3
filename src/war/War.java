package war;
import exception.*;
import exception.checking.*;
import teams.TeamOfAborigines;
import teams.TeamOfPolicemen;
import weapons.Choose;

public class War{
	private TeamOfAborigines t1;
	private TeamOfPolicemen t2;
	public War(TeamOfAborigines t1, TeamOfPolicemen t2){
		this.t1 = t1;
		this.t2 = t2;
	}
	public TeamOfAborigines getTeamOfAborigines(){
		return t1;
	}
	public TeamOfPolicemen getTeamOfPolicemen(){
		return t2;
	}
	public void go() throws AmountException, TwinsException{
		Amount amount = new Amount();
		if (amount.check(t1,t2)) throw new AmountException("You have created unequal or empty teams. There are " + t1.get().size() + " people in the Aborigines team, " + t2.get().size() + "  people in the Policemen team.");
	    Twins twins = new Twins();
		if (twins.check(t1,t2)) throw new TwinsException("Twins can't fight");
	    MyThread t = new MyThread();
  	    for (int i=0; i < t1.get().size(); i++) {
			  t.stop();
			  Choose c = new Choose();
			  (t1.get().get(i)).takeWeapon(c.random());
			  (t2.get().get(i)).takeWeapon(c.random());
			  if (Math.random() <= 0.5) t1.get().get(i).hitPoliceman(t2.get().get(i));
			  else t2.get().get(i).hitAborigine(t1.get().get(i));
	    }
		t.stop();
    }
}